package algorithms;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rkarnati on 4/12/17.
 */
@RunWith(JUnit4.class)
public class BTLevelOrderTraversalTest {

    TreeNode root = new TreeNode(3);
    TreeNode left;
    TreeNode right;

    @Before
    public void setUp() {
        left = new TreeNode(9);
        right = new TreeNode(20);
        root.left = left;
        root.right = right;

        left = new TreeNode(15);
        right = new TreeNode(7);
        root.right.left = left;
        root.right.right = right;
    }

    @Test
    public void testBTLevelOrder() {
        BTLevelOrderTraversal bfT = new BTLevelOrderTraversal();
        bfT.levelOrder(root);

    }
}