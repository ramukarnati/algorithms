package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rkarnati on 4/12/17.
 */
public class InorderTraversalUsingMorrisAlgo {

    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> inOrder = new ArrayList<Integer>();
        TreeNode precede;
        while (root != null) {

            if (root.left != null) {
                precede = root.left;
                while (precede.right != null && precede.right != root) {
                    precede = precede.right;
                }
                if (precede.right == null) {
                    precede.right = root;
                    root = root.left;
                } else if (precede.right == root) {
                    inOrder.add(root.val);
                    precede.right = null;
                    root = root.right;
                }

            } else {
                inOrder.add(root.val);
                root = root.right;
            }
        }

        return inOrder;

    }
}
