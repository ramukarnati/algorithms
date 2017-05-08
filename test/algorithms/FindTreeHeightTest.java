package algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rkarnati on 4/15/17.
 */
public class FindTreeHeightTest {

    TreeNode root = new TreeNode(1);
    TreeNode left;
    TreeNode right;

    @Before
    public void setUp() {
        left = new TreeNode(2);
        right = new TreeNode(3);
        root.left = left;
        root.right = right;

        left = new TreeNode(4);
        right = new TreeNode(5);
        root.left.left = left;
        root.left.right = right;

        left = new TreeNode(6);
        right = new TreeNode(7);
        root.right.left = left;
        root.right.right = right;

        left = new TreeNode(8);
        root.right.left.left = left;

    }

    @Test
    public void findHeight() throws Exception {
        FindTreeHeight findTreeHeight = new FindTreeHeight();
        Assert.assertEquals(findTreeHeight.findHeight(root), 4);
    }

}