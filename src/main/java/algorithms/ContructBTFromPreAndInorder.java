package algorithms;

/**
 * Created by rkarnati on 4/13/17.
 */
public class ContructBTFromPreAndInorder {

    public TreeNode ContructBT(int[] inOrder, int[] preOrder){
        TreeNode root;
        TreeNode curr = null;
        int precount = 0;

        if (inOrder.length != 0) {
            curr = root = new TreeNode(preOrder[0]);
            makeTree(root, inOrder, preOrder, 0, inOrder.length, precount);
        }


        return curr;
    }
    private int findRootIndexFromInOrder(int[] inOrder, int minIndex, int maxIndex, int target){
        int i = 0;
        for (i = minIndex; i < maxIndex; i++) {
            if (inOrder[i] == target) break;
        }
        return i;
    }

    public TreeNode findRoot(int[] inOrder, int[] preOrder, int min, int max, int precount){
        TreeNode curreRoot = null;

        for (int i = precount; i < preOrder.length; i++) {
            for (int j = min; j < max; j++) {
                if (preOrder[i] == inOrder[j]){
                    curreRoot = new TreeNode(preOrder[i]);
                    return curreRoot;
                }

            }
        }

        return curreRoot;
    }

    public void makeTree(TreeNode root, int[] inOrder, int[] preOrder, int min, int max, int precount) {
        if (root == null){
            return;
        }
        int rootIndex = findRootIndexFromInOrder(inOrder, 0, max, root.val);
        precount++;
        if (min < max) {
            root.left = findRoot(inOrder, preOrder, min, rootIndex, precount);
            root.right = findRoot(inOrder, preOrder, rootIndex+1, max, precount);
            makeTree(root.left, inOrder, preOrder, min, rootIndex, precount );
            makeTree(root.right, inOrder, preOrder, rootIndex+1, max, precount );
        }

    }

}
