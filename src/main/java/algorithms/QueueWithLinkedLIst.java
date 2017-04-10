package algorithms;

/**
 * Created by rkarnati on 4/9/17.
 */
public class QueueWithLinkedLIst {


    Node head = null;
    Node current = null;

    public void push(int val) {
        Node n = new Node(val);
        if (head == null){
            head = n;
            current = head;
        } else {
            current.next = n;
            current = current.next;
        }
    }

    public int pop() throws Exception{
        if (head == null) {
            throw new Exception("Queue is empty");
        }
        Node temp = head;
        head = head.next;
        return temp.val;
    }


}
