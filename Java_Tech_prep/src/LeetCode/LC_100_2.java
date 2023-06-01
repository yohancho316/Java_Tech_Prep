package LeetCode;
import LeetCode.TreeNode;
public class LC_100_2 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null) return p == q;
        else if(p.val != q.val) return false;
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }

    public static void main(String[] args) {

    }
}
