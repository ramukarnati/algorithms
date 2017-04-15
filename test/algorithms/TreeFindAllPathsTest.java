package algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rkarnati on 4/13/17.
 */
@RunWith(JUnit4.class)
public class TreeFindAllPathsTest {
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
    public void findPaths() throws Exception {
        TreeFindAllPaths treePaths = new TreeFindAllPaths();
        List<List<Integer>> allPaths =  treePaths.findPaths(root);
        Assert.assertTrue(allPaths!=null);

    }

}