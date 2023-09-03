package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LC_965_1 {

    public void traverseTree(TreeNode root, Map<Integer,Integer> map) {
        if(root == null) return;
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        traverseTree(root.left, map);
        traverseTree(root.right, map);
    }

    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return false;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        traverseTree(root, map);
        return map.size() == 1;
    }
}
