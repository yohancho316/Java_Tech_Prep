package LeetCode;

public class LC_993_1 {

    public boolean xExists = false;
    public boolean yExists = false;

    public int xLevel = 0;
    public int yLevel = 0;
    public int solutionLevel = -1;

    public TreeNode xParent = null;
    public TreeNode yParent = null;

    public void findCousins(TreeNode root, TreeNode parent, int x, int y, int currLvl) {

        if(root == null) return;
        else if(this.xExists && this.yExists) return;
        else if(this.solutionLevel != -1 && currLvl > this.solutionLevel) return;

        if(root.val == x) {
            this.solutionLevel = currLvl;
            this.xExists = true;
            this.xLevel = currLvl;
            this.xParent = parent;
        } else if(root.val == y) {
            this.solutionLevel = currLvl;
            this.yExists = true;
            this.yLevel = currLvl;
            this.yParent = parent;
        }

        findCousins(root.left, root, x, y, currLvl + 1);
        findCousins(root.right, root, x, y, currLvl + 1);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        findCousins(root, null, x, y, 0);
        if(this.xExists == false || this.yExists == false) return false;
        return this.xLevel == this.yLevel && xParent != yParent;
    }

    public static void main(String[] args) {

    }
}
