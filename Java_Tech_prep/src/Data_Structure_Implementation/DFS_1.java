package Data_Structure_Implementation;
import LeetCode.TreeNode;

import java.util.Stack;

public class DFS_1 {

    public static void preOrderTraversal_Iterative(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(root);

        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.val);

            if(temp.right != null) stack.push(temp.right);
            if(temp.left != null) stack.push(temp.left);
        }
    }

    public static void preOrderTraversal_Recursive(TreeNode root) {
        if(root == null) return;
        System.out.println(root.val);
        preOrderTraversal_Recursive(root.left);
        preOrderTraversal_Recursive(root.right);
    }

    public static void postOrderTraversal_Iterative(TreeNode root) {

    }

    public static void postOrderTraversal_Recursive(TreeNode root) {
        if(root == null) return;
        postOrderTraversal_Recursive(root.left);
        postOrderTraversal_Recursive(root.right);
        System.out.println(root.val);
    }
}
