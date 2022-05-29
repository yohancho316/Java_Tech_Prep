package LeetCode;

import java.util.*;

public class FindModeInBST_1 {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int[] findMode(TreeNode root) {
        if(root.left == null && root.right == null) {
            int[] return_arr = new int[1];
            return_arr[0]  = root.val;
            return return_arr;
        }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            map.put(current.val, map.getOrDefault(current.val,0) + 1);

            if(current.right != null) stack.push(current.right);

            if(current.left != null) stack.push(current.left);
        }

        int maxOccurs = Integer.MIN_VALUE;

        for(Integer key : map.keySet()) {
            maxOccurs = Math.max(maxOccurs, map.get(key));
        }

        List<Integer> list = new ArrayList<Integer>();

        for(Integer key: map.keySet()) {
            if(map.get(key) == maxOccurs) {
                list.add(key);
            }
        }

        int[] return_arr = new int[list.size()];
        int pos = 0;

        for(int i = 0; i < list.size(); i++) {
            return_arr[pos] = list.get(i);
            ++pos;
        }

        return return_arr;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(2);

        a1.right = a2;
        a2.left = a3;
        System.out.println(Arrays.toString(findMode(a1)));

    }
}
