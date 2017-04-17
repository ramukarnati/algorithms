package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rkarnati on 4/15/17.
 */
public class BreadthFirstTraversalWithHeight {

    public List<Integer> BFTraversal(TreeNode root) {

        List<Integer> bftList = new ArrayList<Integer>();
        FindTreeHeight findTreeHeight = new FindTreeHeight();
        int h = findTreeHeight.findHeight(root);
        for (int i =1;i <= h; i++) {
            bft(root, i, bftList);
        }
        return bftList;
    }
     public void bft(TreeNode root, int height, List<Integer> bftList) {


        if (root == null) {
            return;
        }
        if (height == 1) {
             bftList.add(root.val);
        } else if (height > 1){
            bft(root.left, height-1, bftList);
            bft(root.right, height-1, bftList);
        }
     }

}
