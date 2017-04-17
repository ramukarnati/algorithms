package algorithms;

/**
 * Created by rkarnati on 4/15/17.
 */
public class FindTreeHeight {


    public int findHeight(TreeNode root) {
        if (root == null ) {
            return 0;
        }
        return 1 + Math.max(findHeight(root.left), findHeight(root.right));

    }
}
