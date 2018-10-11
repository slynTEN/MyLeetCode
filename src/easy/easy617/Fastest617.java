package easy.easy617;

/**
 * Created by teds on 10/8/2018.
 */
public class Fastest617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        TreeNode node = new TreeNode(t1.val + t2.val);
        node.left = mergeTrees(t1.left, t2.left);
        node.right = mergeTrees(t1.right, t2.right);
        return node;
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

        Fastest617 fastest617 = new Fastest617();
        TreeNode t3 = fastest617.mergeTrees(t1, t2);
        TreeNode.printNode(t3, "root");

    }
}
