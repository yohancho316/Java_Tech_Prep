package LeetCode;
import java.util.Stack;

public class TwoSumIV_1 {

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

    public static boolean checkExists(TreeNode root, int target, TreeNode exclusion) {
        while(root != null) {
            if((root.val == target) && (root != exclusion)) return true;
            if(target < root.val) {
                root = root.left;
            } else if(target > root.val){
                root = root.right;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean findTarget(TreeNode root, int k) {

        TreeNode head = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(head);

        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            int diff = k - temp.val;
            TreeNode tree = root;
            if(checkExists(tree, diff, temp)) {
                return true;
            }

            if(temp.right != null) {
                stack.push(temp.right);
            }

            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(5);
        TreeNode a2 = new TreeNode(3);
        TreeNode a3 = new TreeNode(2);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(7);
        TreeNode a6 = new TreeNode(6);
        TreeNode a7 = new TreeNode(10);

        a1. left = a2;
        a2.left = a3;
        a2.right = a4;
        a1.right = a5;
        a5.left = a6;
        a5.right = a7;

        System.out.println(findTarget(a1, 6));

    }
}
