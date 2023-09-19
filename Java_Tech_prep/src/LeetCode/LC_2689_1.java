package LeetCode;

class RopeTreeNode {

    public String val;
    public int len;
    public RopeTreeNode left;
    public RopeTreeNode right;

    public RopeTreeNode() {}
    public RopeTreeNode(String val) {
        this.val = val;
        this.len = 0;
    }
    public RopeTreeNode(int len) {
        this.len = len;
        this.val = "";
    }
    public RopeTreeNode(int len, RopeTreeNode left, RopeTreeNode right) {
        this.len = len;
        this.val = "";
        this.left = left;
        this.right = right;
    }
}

public class LC_2689_1 {

    public String buildStr(RopeTreeNode root) {
        if(root == null) return "";
        else if(root.left == null && root.right == null) return root.val;
        return "" + buildStr(root.left) + buildStr(root.right);
    }

    public char getKthCharacter(RopeTreeNode root, int k) {
        String str = buildStr(root);
        System.out.println("String: " + str);
        return str.charAt(k);
    }
}
