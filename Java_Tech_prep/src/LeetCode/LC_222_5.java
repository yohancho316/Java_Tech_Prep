package LeetCode;

public class LC_222_5 {

    public int calcLevels(TreeNode root) {
        if(root == null) return 0;
        return 1 + calcLevels(root.left);
    }

    public boolean checkExists(int levels, int fixed, TreeNode root) {
        int left = 0;
        int right = (int) Math.pow(2, levels - 1) - 1;
        int pivot;
        for(int i = 0; i < levels - 1; ++i) {
            pivot = (right - left) / 2 + left;
            if(fixed <= pivot) {
                root = root.left;
                right = pivot - 1;
            } else {
                root = root.right;
                left = pivot + 1;
            }
        }
        return root != null;
    }

    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int levels = calcLevels(root);
        if(levels == 1) return levels;
        int nodes = (int) Math.pow(2, levels - 1) - 1;
        int left = 0; int right = (int) Math.pow(2, levels - 1) - 1; int mid;
        while(left <= right) {
            mid = (right - left) / 2 + left;
            boolean exists = checkExists(levels, mid, root);
            if(exists) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nodes + left;
    }
}
