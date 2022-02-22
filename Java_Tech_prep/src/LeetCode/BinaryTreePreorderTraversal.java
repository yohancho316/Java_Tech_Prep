package LeetCode;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BinaryTreePreorderTraversal {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int _val) {
            this.val = _val;
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {

        // Local Declarations
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();

        if(root == null) {
            return list;
        }

        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            list.add(current.val);

            if(current.right != null) {
                stack.push(current.right);
            }

            if(current.left != null) {
                stack.push(current.left);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n1.right = n2;
        n2.left = n3;

        List<Integer> new_list = preorderTraversal(n1);
        for(Integer x : new_list) {
            System.out.println(x);
        }
    }
}
