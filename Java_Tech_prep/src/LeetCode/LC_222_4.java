package LeetCode;

public class LC_222_4 {

    public int countLevels(TreeNode root) {
        int levels = 0;
        while(root != null) {
            ++levels;
            root = root.left;
        }
        return levels;
    }

    public boolean checkExists(int fixed, int levels, TreeNode root) {
        if(root == null) return false;
        int left = 0;
        int right = (int) Math.pow(2, levels - 1) - 1;
        int mid;
        for(int i = 1; i < levels; ++i) {
            mid = (right - left) / 2 + left;
            if(fixed <= mid) {
                root = root.left;
                right = mid - 1;
            } else {
                root = root.right;
                left = mid + 1;
            }
        }
        return root != null;
    }

    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int totalLevels = countLevels(root);
        if(totalLevels == 1) return 1;
        int totalNodes = (int) Math.pow(2, totalLevels - 1) - 1;
        int left = 0;
        int right = (int) Math.pow(2, totalLevels - 1) - 1;
        int mid;

        while(left <= right) {
            mid = (right - left) / 2 + left;
            boolean flag = checkExists(mid, totalLevels, root);
            if(flag) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return totalNodes + left;
    }
}
