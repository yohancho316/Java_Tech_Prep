package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LC_653_1 {

    public boolean searchTree(TreeNode root, int k, Set<Integer> set) {

        if(root == null) return false;

        if(set.contains(k - root.val)) {
            return true;
        } else {
            set.add(root.val);
        }

        return searchTree(root.left, k, set) || searchTree(root.right, k, set);
    }

    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        Set<Integer> set = new HashSet<Integer>();
        return searchTree(root, k, set);
    }
}
