package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by rkarnati on 4/12/17.
 */
public class BTLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> levelOrder = new ArrayList<Integer>();
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        int levelChildren = 1;
        TreeNode curr;
        if (root == null) {
            return levels;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (queue.size() != 0) {
            curr = queue.remove();
            if (levelChildren != 0){
                levelOrder.add(curr.val);
                levelChildren--;
            }
            if (levelChildren == 0) {
                levels.add(levelOrder);
                levelOrder = new ArrayList<Integer>();
                if (curr.left != null) levelChildren++;
                if (curr.right != null) levelChildren++;
            }
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);


        }
        return levels;

    }
}
