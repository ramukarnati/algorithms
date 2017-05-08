package algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rkarnati on 4/13/17.
 */
@RunWith(JUnit4.class)
public class DepthOfTreeTest {


    TreeNode root = new TreeNode(1);
    TreeNode left;
    TreeNode right;

    @Before
    public void setUp() {
        left = new TreeNode(2);
        root.left = left;


    }

    @Test
    public void testDepth(){
        DepthOfTree dTree = new DepthOfTree();
        Assert.assertEquals(dTree.maxDepth(root), 2);
    }

}