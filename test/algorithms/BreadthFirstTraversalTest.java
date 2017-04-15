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
public class BreadthFirstTraversalTest {

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

    }

    @Test
    public void testBFS(){
        BreadthFirstTraversal bft = new BreadthFirstTraversal();
        Integer[] expected = {1,2,3,4,5,6,7};
        Integer[] actual = new Integer[7];
        actual = bft.bft(root).toArray(actual);
        Assert.assertArrayEquals(actual, expected);
    }

}