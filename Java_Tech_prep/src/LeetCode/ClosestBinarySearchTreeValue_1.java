package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ClosestBinarySearchTreeValue_1 {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int closestValue(TreeNode root, double target) {
        if(root.val == target) return root.val;
        if(root.left == null && root.right == null) return root.val;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        TreeNode current = root;

        while(!stack.isEmpty() || current != null) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                list.add(current.val);
                current = current.right;
            }
        }

        int left = 0;
        int right = list.size() - 1;

        while(left <= right) {
            int mid = (((right - left) / 2) + left);
            if(list.get(mid) == target) return list.get(mid);
            else if(target < list.get(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if(left >= list.size()) {
            return list.get(list.size() - 1);
        } else if(right < 0) {
            return list.get(0);
        }

        if(Math.abs(target - list.get(right)) <= (Math.abs(target - list.get(left)))) {
            return list.get(right);
        }
        return list.get(left);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(50);
        TreeNode n2 = new TreeNode(10);
        TreeNode n3 = new TreeNode(100);

        n1.left = n2;
        //n1.right = n3;

        System.out.println(closestValue(n1, 100));


    }
}
