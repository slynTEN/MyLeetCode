package easy.easy617;

/**
 * Created by teds on 9/28/2018.
 */
public class Solution617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode t3 = new TreeNode(0);
        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        iterateTrees(t1, t2, t3);
        return t3;
    }

    public void iterateTrees(TreeNode t1, TreeNode t2, TreeNode t3) {
        TreeNode t1Left = t1.left;
        TreeNode t2Left = t2.left;
        TreeNode t1Right = t1.right;
        TreeNode t2Right = t2.right;

        t3.val = t1.val + t2.val;

        if(t1Left!=null) {
            if(t2Left!=null) {
                TreeNode t3Left = new TreeNode(0);
                t3.left = t3Left;
                iterateTrees(t1Left, t2Left, t3Left);
            } else
                t3.left = t1Left;
        } else
            t3.left = t2Left;

        if(t1Right!=null) {
            if(t2Right!=null) {
                TreeNode t3Right = new TreeNode(0);
                t3.right = t3Right;
                iterateTrees(t1Right, t2Right, t3Right);
            } else
                t3.right = t1Right;
        } else
            t3.right = t2Right;

    }
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t1Left = new TreeNode(3);
        t1.left = t1Left;
        TreeNode t1Right = new TreeNode(2);
        t1.right = t1Right;
        TreeNode t1LeftLeft = new TreeNode(5);
        t1Left.left = t1LeftLeft;

        TreeNode t2 = new TreeNode(2);
        TreeNode t2Left = new TreeNode(1);
        t2.left = t2Left;
        TreeNode t2Right = new TreeNode(3);
        t2.right = t2Right;
        TreeNode t2LeftRight = new TreeNode(4);
        t2Left.right = t2LeftRight;
        TreeNode t2RightRight = new TreeNode(7);
        t2Right.right = t2RightRight;

        Solution617 solution617 = new Solution617();
        TreeNode t3 = solution617.mergeTrees(t1, t2);
        TreeNode.printNode(t3, "root");

    }
}
