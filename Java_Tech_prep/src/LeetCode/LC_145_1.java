package LeetCode;
import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LC_145_1 {

    public static List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        TreeNode temp = null;

        while(!stack.isEmpty() || current != null) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.pop();
                    //System.out.println(temp.val + "\t");
                    list.add(temp.val);

                    while(!stack.isEmpty() && stack.peek().right == temp) {
                        temp = stack.pop();
                        //System.out.println(temp.val + "\t");
                        list.add(temp.val);
                    }
                } else {
                    current = stack.peek().right;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n5.right = n6;
        n6.right = n7;

        System.out.println("Array: " + Arrays.toString(postorderTraversal(n1).toArray()));


    }
}
