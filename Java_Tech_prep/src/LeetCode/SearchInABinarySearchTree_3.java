package LeetCode;

public class SearchInABinarySearchTree_3 {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode search(TreeNode root, int val) {
        // Base Case
        if(root == null) return null;

        if(root.val == val) {
            return root;
        } else if(val < root.val) {
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = search(root, val);
        return node;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(5);
        TreeNode a2 = new TreeNode(3);
        TreeNode a3 = new TreeNode(1);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(8);
        TreeNode a6 = new TreeNode(6);
        TreeNode a7 = new TreeNode(10);

        a1.left = a2;
        a2.left = a3;
        a2.right = a4;
        a1.right = a5;
        a5.left = a6;
        a5.right = a7;

        TreeNode found = search(a1, 10);
        System.out.println(found.val);

    }
}
