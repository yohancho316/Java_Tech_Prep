package LeetCode;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import LeetCode.TreeNode;

public class LC_257_2 {

    public static void findPaths(TreeNode root, List<String> list, String path) {
        // Base Cases
        if(root == null) return;
        else if(root.left == null && root.right == null) {
            path += "" + root.val;
            list.add(path);
            return;
        }

        path += "" + root.val + "->";
        findPaths(root.left, list,path);
        findPaths(root.right,list,path);
    }


    public static List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        findPaths(root, list, "");
        return list;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(30);

        n1.left = n2;
        n1.right = n3;

        List<String> list = binaryTreePaths(n1);

        System.out.println("List Size: " + list.size());
        for(String path : list) {
            System.out.println("Path: " + path + "\n\n");
        }

    }
}
