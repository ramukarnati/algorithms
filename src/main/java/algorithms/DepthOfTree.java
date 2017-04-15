package algorithms;

/**
 * Created by rkarnati on 4/13/17.
 */
public class DepthOfTree {

    public int maxDepth(TreeNode root) {
        return findMaxDepth(root);

    }

    private int findMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(findMaxDepth(root.left), findMaxDepth(root.right));
    }
}
