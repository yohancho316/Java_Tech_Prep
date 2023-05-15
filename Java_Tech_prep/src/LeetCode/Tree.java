package LeetCode;

public class Tree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        TreeNode root;

        public BinaryTree() {
            this.root = null;
        }

        public void insert(int val) {
            this.root = preOrder_insertHelper(this.root, val);
        }

        private TreeNode preOrder_insertHelper(TreeNode node, int val) {
            if (node == null) {
                return new TreeNode(val);
            }

            if (val < node.val) {
                node.left = preOrder_insertHelper(node.left, val);
            } else {
                node.right = preOrder_insertHelper(node.right, val);
            }

            return node;
        }

        public boolean search(int val) {
            return searchHelper(this.root, val);
        }

        private boolean searchHelper(TreeNode node, int val) {
            if (node == null) {
                return false;
            }

            if (node.val == val) {
                return true;
            } else if (val < node.val) {
                return searchHelper(node.left, val);
            } else {
                return searchHelper(node.right, val);
            }
        }
    }
}
