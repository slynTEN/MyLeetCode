package easy.easy104;

import easy.easy617.TreeNode;

/**
 * Created by teds on 10/11/2018.
 */
public class Fastest104 {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int le = maxDepth(root.left);
        int ri = maxDepth(root.right);
        return le > ri ? le+1 : ri+1;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t1Left = new TreeNode(3);
        t1.left = t1Left;
        TreeNode t1Right = new TreeNode(2);
        t1.right = t1Right;
        TreeNode t1LeftLeft = new TreeNode(5);
        t1Left.left = t1LeftLeft;

        Fastest104 fastest104 = new Fastest104();
        System.out.println(fastest104.maxDepth(t1));

    }
}
