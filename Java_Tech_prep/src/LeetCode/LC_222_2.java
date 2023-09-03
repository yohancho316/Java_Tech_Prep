package LeetCode;

public class LC_222_2 {

    // Return tree depth in O(d) time.
    public int computeDepth(TreeNode node) {
        int d = 0;
        while (node.left != null) {
            node = node.left;
            ++d;
        }
        return d;
    }

    // Last level nodes are enumerated from 0 to 2**totalLvl - 1 (left -> right).
    // Return True if last level root mid exists.
    // Binary search with O(totalLvl) complexity.
    public boolean exists(int mid, int totalLvl, TreeNode root) {

        int left = 0;
        int right = (int) Math.pow(2, totalLvl - 1) - 1;
        int center;

        for(int i = 0; i < totalLvl; ++i) {

            center = left + (right - left) / 2;


            if (mid <= center) {
                root = root.left;
                right = center;
            }
            else {
                root = root.right;
                left = center + 1;
            }
        }
        return root != null;
    }

    public int countNodes(TreeNode root) {
        // if the tree is empty
        if (root == null) return 0;

        int totalLvl = computeDepth(root);
        // if the tree contains 1 node
        if (totalLvl == 0) return 1;

        // Last level nodes are enumerated from 0 to 2**totalLvl - 1 (left -> right).
        // Perform binary search to check how many nodes exist.
        int left = 1;
        int right = (int)Math.pow(2, totalLvl) - 1;
        int mid;

        while (left <= right) {

            mid = left + (right - left) / 2;

            if (exists(mid, totalLvl, root)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // The tree contains 2**totalLvl - 1 nodes on the first (totalLvl - 1) levels
        // and left nodes on the last level.
        return (int)Math.pow(2, totalLvl) - 1 + left;
    }
}
