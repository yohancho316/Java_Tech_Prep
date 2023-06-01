package LeetCode;
import LeetCode.TreeNode;

import java.util.Stack;

public class LC_104_3 {

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<Integer> heightStack = new Stack<Integer>();

        int maxHeight = 0;

        nodeStack.add(root);
        heightStack.add(1);

        while(!nodeStack.isEmpty()) {
            TreeNode tempNode = nodeStack.pop();
            int currentHeight = heightStack.pop();

            maxHeight = currentHeight > maxHeight ? currentHeight : maxHeight;

            if(tempNode.right != null) {
                nodeStack.push(tempNode.right);
                heightStack.push(currentHeight + 1);
            }

            if(tempNode.left != null) {
                nodeStack.push(tempNode.left);
                heightStack.push(currentHeight + 1);
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n6.left = n8;

        System.out.println("Max Height: " + maxDepth(n1));

    }
}
