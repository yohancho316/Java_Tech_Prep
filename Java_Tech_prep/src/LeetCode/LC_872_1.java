package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_872_1 {

    public void fillList(TreeNode root, List<Integer> list) {
        if(root == null) return;
        else if(root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        fillList(root.left, list);
        fillList(root.right, list);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        fillList(root1, list1);
        fillList(root2, list2);

        if(list1.size() != list2.size()) return false;

        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) != list2.get(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
