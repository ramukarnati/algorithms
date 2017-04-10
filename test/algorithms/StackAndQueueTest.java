package algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rkarnati on 4/9/17.
 */
@RunWith(JUnit4.class)
public final class StackAndQueueTest {

    StackWithLinkedList stack = null;
    QueueWithLinkedLIst queue = null;

    @Before
    public void setUp(){
        stack = new StackWithLinkedList();
        stack.push(10);
        stack.push(3);
        stack.push(8);
        queue = new QueueWithLinkedLIst();
        queue.push(10);
        queue.push(3);
        queue.push(11);
    }

    @Test(expected = Exception.class)
    public void testStack() throws Exception {
        Assert.assertEquals(stack.pop(), 8);
        Assert.assertEquals(stack.pop(), 3);
        Assert.assertEquals(stack.pop(), 10);
        Assert.assertEquals(queue.pop(), 10);
        Assert.assertEquals(queue.pop(), 3);
        Assert.assertEquals(queue.pop(), 11);
        queue.pop();
        stack.pop();
    }

}
