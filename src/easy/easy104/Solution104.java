package easy.easy104;

import easy.easy617.TreeNode;

/**
 * Created by teds on 10/11/2018.
 */
public class Solution104 {

    public int maxDepth(TreeNode root) {
        return getMax(root, 0);
    }

    public int getMax(TreeNode node, int cu) {
        if(node == null)
            return cu;
        cu++;
        int le = getMax(node.left, cu);
        int ri = getMax(node.right, cu);
        return le > ri ? le : ri;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t1Left = new TreeNode(3);
        t1.left = t1Left;
        TreeNode t1Right = new TreeNode(2);
        t1.right = t1Right;
        TreeNode t1LeftLeft = new TreeNode(5);
        t1Left.left = t1LeftLeft;

        Solution104 solution104 = new Solution104();
        System.out.println(solution104.maxDepth(t1));

    }
}
