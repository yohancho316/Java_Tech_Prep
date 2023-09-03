package LeetCode;

public class LC_222_3 {

    public int calcDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + calcDepth(root.left);
    }

    public boolean checkExists(int mid, int totalLvl, TreeNode root) {

        int left = 0;
        int right = (int) Math.pow(2, totalLvl - 1) - 1;
        int center;

        // Iterate through Each Level in the BT
        for(int i = 1; i < totalLvl; ++i) {

            // Calculate Center Fixed Position
            center = (right - left) / 2 + left;

            // Determine if we Traverse Left / Right for Each Lvl of the BT
            if(mid <= center) {
                root = root.left;
                right = center;
            } else {
                root = root.right;
                left = center + 1;
            }
        }

        return root != null;
    }

    public int countNodes(TreeNode root) {

        // Step # 1: Check if Tree is Empty
        if(root == null) return 0;

        // Step # 2: Determine Total # of Levels in the BT
        int totalLvl = calcDepth(root);

        // Step # 3: Check if BT has 1 Level
        if(totalLvl == 1) return 1;

        // Step # 4: Calculate the Total Number of Nodes up to Last Level
        int totalNodes = (int) Math.pow(2, totalLvl - 1) - 1;

        // Step # 5: Declare & Initialize Left & Right & Mid
        int left = 0;
        int right = (int) Math.pow(2, totalLvl - 1) - 1;
        int mid;

        // Step # 6: Iterate through the BT using Binary Search
        while(left <= right) {

            // Step # 7: Calculate Mid per Iteration
            mid = (right - left) / 2 + left;

            // Step # 8: Check if the Node Exists in the BT
            boolean flag = checkExists(mid, totalLvl, root);

            // Step # 9: Reassign Left/Right based on Node Existence
            if(flag) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Step 10: Return Total Nodes in the BT
        return totalNodes + left;
    }
}
