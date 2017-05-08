package algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rkarnati on 4/12/17.
 */
@RunWith(JUnit4.class)
public class SymmetricTreeTest {


    TreeNode root = new TreeNode(1);
    TreeNode left;
    TreeNode right;

    @Before
    public void setUp() {
        left = new TreeNode(2);
        right = new TreeNode(2);
        root.left = left;
        root.right = right;

        left = new TreeNode(3);
        right = new TreeNode(4);
        root.left.left = left;
        root.left.right = right;

        left = new TreeNode(4);
        right = new TreeNode(3);
        root.right.left = left;
        root.right.right = right;

    }


    @Test
    public void testSymmetricTree() {
        SymmetricTree st = new SymmetricTree();
        SymmetricTreeRecursive str =  new SymmetricTreeRecursive();
        //Assert.assertFalse(st.isTreeSymmetric(root));
        Assert.assertTrue(str.isSymmetric(root));
    }

}