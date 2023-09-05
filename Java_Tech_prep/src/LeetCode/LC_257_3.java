package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_257_3 {

    public void traversePath(TreeNode root, List<String> list, String path) {
        if(root == null) return;
        if(path.isEmpty()) path += "" + root.val;
        else path += "->" + root.val;

        if(root.left == null && root.right == null) list.add(path);

        traversePath(root.left, list, path);
        traversePath(root.right, list, path);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        traversePath(root, list, "");
        return list;
    }
}
