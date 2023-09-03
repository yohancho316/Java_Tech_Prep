package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_1469_1 {

    public List<Integer> list;

    public void fillLonely(TreeNode root) {
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        if(root.left == null) list.add(root.right.val);
        else if(root.right == null) list.add(root.left.val);
        fillLonely(root.left);
        fillLonely(root.right);
    }

    public List<Integer> getLonelyNodes(TreeNode root) {
        this.list = new ArrayList<Integer>();
        fillLonely(root);
        return this.list;
    }
}
