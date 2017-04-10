package algorithms;

/**
 * Created by rkarnati on 4/9/17.
 */
public class StackWithLinkedList {


    Node first = null;


    public void push(int val) {
        Node n = new Node(val);
        n.next = first;
        first = n;
    }


    public int pop() throws Exception{
        if (first == null) {
            throw new Exception("Stack is empty");
        }
        Node temp = first;
        first = first.next;
        return temp.val;
    }
}
