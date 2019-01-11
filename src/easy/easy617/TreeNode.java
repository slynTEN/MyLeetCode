package easy.easy617;

/**
 * Created by teds on 9/30/2018.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static void printNode(TreeNode node, String path) {
        System.out.println(path + " = " + node.val);
        if(node.left != null) {
            printNode(node.left, path + ".left");
        }
        if(node.right != null) {
            printNode(node.right, path + ".right");
        }
    }

}
