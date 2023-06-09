package LeetCode;

import java.util.ArrayList;
import java.util.List;
import LeetCode.TreeNode;
public class LC_257_1 {

    public static void findPath(TreeNode root, String path, List<String> list) {
        if(root == null) return;
        if(path.isEmpty()) {
            path = "" + root.val;
        } else {
            path += ("->" + root.val);
        }

        if(root.left == null && root.right == null) {
            list.add(path);
            return;
        } else if(root.left != null && root.right != null) {
            findPath(root.left, path, list);
            findPath(root.right, path, list);
        } else if(root.left == null) {
            findPath(root.right, path, list);
        } else if(root.right == null) {
            findPath(root.left, path, list);
        }
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        String path = "";
        findPath(root, path, list);
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
        n1.right= n3;
        n2.left = n4;
        n4.right = n5;
        n3.left = n6;
        n3.right = n7;


        List<String> list = binaryTreePaths(n1);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
