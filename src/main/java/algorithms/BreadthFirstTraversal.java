package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by rkarnati on 4/12/17.
 */
public class BreadthFirstTraversal {

    public List<Integer> bft(TreeNode root) {
        List<Integer> bfTraversal = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode curr;
        if (root != null) {
            queue.add(root);
        }
        while (queue.size() != 0) {
            curr = queue.remove();
            bfTraversal.add(curr.val);
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
        return bfTraversal;

    }


}
