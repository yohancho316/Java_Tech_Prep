package LeetCode;
import java.util.LinkedList;
import java.util.Queue;

public class RangeSumOfBST_1 {

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

    public static int rangeSumBST(TreeNode root, int low, int high) {

        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        while(!queue.isEmpty()) {

            TreeNode temp = queue.remove();

            if(temp.val >= low && temp.val <= high) {
                sum += temp.val;
            }

            if(temp.left != null) {
                queue.add(temp.left);
            }

            if(temp.right != null) {
                queue.add(temp.right);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(7);
        TreeNode n5 = new TreeNode(15);
        TreeNode n6 = new TreeNode(13);
        TreeNode n7 = new TreeNode(20);

        n1.left = n2;
        n1.right = n5;
        n2.left = n3;
        n2.right = n4;
        n5.left = n6;
        n5.right = n7;

        System.out.println(rangeSumBST(n1, 5, 15));




    }
}
