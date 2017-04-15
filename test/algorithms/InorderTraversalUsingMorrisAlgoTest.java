package algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by rkarnati on 4/12/17.
 */
@RunWith(JUnit4.class)
public class InorderTraversalUsingMorrisAlgoTest {

    TreeNode root = new TreeNode(2);
    TreeNode left;
    TreeNode right;
    @Before
    public void setUp() {
        left = new TreeNode(3);
        right = new TreeNode(3);
        root.left = left;
        root.right = right;
        left = new TreeNode(4);
        right = new TreeNode(5);
        root.left.left = left;
        root.left.right = right;
        left = new TreeNode(5);
        right = new TreeNode(4);
        root.right.left = left;
        root.right.right = right;

    }
    @Test
    public void testInOrderTraversal() {
        InorderTraversalUsingMorrisAlgo inorderTraversalUsingMorrisAlgo = new InorderTraversalUsingMorrisAlgo();
        Integer[] expected = {4, 3, 5, 2, 5, 3, 4};
        Integer[] actual = new Integer[7];
        actual = inorderTraversalUsingMorrisAlgo.inOrderTraversal(root).toArray(actual);
        Assert.assertArrayEquals( actual,  expected);
    }
}