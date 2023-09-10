package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_257_4 {

    public void fillList(TreeNode root, List<String> list, String path) {
        if(root == null) return;
        if (root.left == null && root.right == null) {
            path += "->" + root.val;
            list.add(path);
            return;
        }

        if(path.isEmpty()) path += "" + root.val;
        else path += "->" + root.val;
        fillList(root.left, list, path);
        fillList(root.right, list, path);
    }

    public List<String> binaryTreePaths(TreeNode root) {

        if(root == null) return new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        fillList(root, list, "");
        return list;
    }
}
