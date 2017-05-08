package algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rkarnati on 4/13/17.
 */
@RunWith(JUnit4.class)
public class ConstructBTFromPostOrderAndInOrderTest {

    @Test
    public void constructBT() throws Exception {

        int[] postorder  = {2,1};
        int[] inOrder = {2, 1};
        ConstructBTFromPostOrderAndInOrder constructBTFromPostOrderAndInOrder = new ConstructBTFromPostOrderAndInOrder();
        TreeNode root = constructBTFromPostOrderAndInOrder.constructBT(postorder, inOrder);

        Assert.assertTrue(root != null);;

    }

}