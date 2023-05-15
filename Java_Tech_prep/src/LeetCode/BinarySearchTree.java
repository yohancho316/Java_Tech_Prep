package LeetCode;

public class BinarySearchTree {

    public static class ListNode {
        private int val;
        private ListNode left;
        private ListNode right;

        public ListNode() {
            this.val = 0;
            this.left = null;
            this.right = null;
        }

        public ListNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        public int getVal() {
            return this.val;
        }

        public ListNode getLeft() {
            return this.left;
        }

        public ListNode getRight() {
            return this.right;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void setLeft(ListNode left) {
            this.left = left;
        }

        public void setRight(ListNode right) {
            this.right = right;
        }
    }

    public static class BinaryTree {

        public ListNode root;

        public void insert(int val) {
            this.root = this.recursiveInsert(this.root, val);
        }

        public ListNode recursiveInsert(ListNode root, int val) {

            if(root == null) {
                return new ListNode(val);
            }

            if(val < root.getVal()) {
                root.setLeft(this.recursiveInsert(root.getLeft(), val));
            } else {
                root.setRight(this.recursiveInsert(root.getRight(), val));
            }

            return root;
        }

        // Each Node you print Value and then Recursively Traverse Left Subtree then Right Subtree
        public void preOrderTraversal(ListNode root) {

            // Base Case
            if(root == null) return;

            System.out.println("Value: " + root.val);
            this.preOrderTraversal(root.getLeft());
            this.preOrderTraversal(root.getRight());
        }

        public void postOrderTraversal(ListNode root) {

            // Base Condition
            if(root == null) return;

            this.postOrderTraversal(root.getLeft());
            this.postOrderTraversal(root.getRight());
            System.out.println(root.val);
        }

        public void levelOrderTraversal(ListNode root) {

            // Base Condition
            if(root == null) return;

            this.levelOrderTraversal(root.getLeft());
            System.out.println(root.val);
            this.levelOrderTraversal(root.getRight());


        }
    }





    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(10);
        tree.insert(5);
        tree.insert(100);
        System.out.println("PreOrder Traversal:");
        tree.preOrderTraversal(tree.root);
        System.out.println("\nPostOrder Traversal:");
        tree.postOrderTraversal(tree.root);
        System.out.println("\nLevelOrder Traversal:");
        tree.levelOrderTraversal(tree.root); // 5, 10,
    }
}
