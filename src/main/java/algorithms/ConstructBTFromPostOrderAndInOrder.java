package algorithms;

/**
 * Created by rkarnati on 4/13/17.
 */
public class ConstructBTFromPostOrderAndInOrder {

    public TreeNode constructBT(int[] postorder, int[] inorder) {
        TreeNode curr = null;
        TreeNode root;
        int postorderCount = postorder.length;
        if (inorder.length != 0){
            curr = root = new TreeNode(postorder[postorder.length-1]);
            makeTree(root, inorder, postorder, 0, inorder.length, postorderCount);
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

    public TreeNode findRoot(int[] inOrder, int[] postorder, int min, int max, int precount){
        TreeNode curreRoot = null;

        for (int i = precount; i >=0; i--) {
            for (int j = min; j < max; j++) {
                if (postorder[i] == inOrder[j]){
                    curreRoot = new TreeNode(postorder[i]);
                    return curreRoot;
                }

            }
        }

        return curreRoot;
    }

    public void makeTree(TreeNode root, int[] inOrder, int[] postorder, int min, int max, int postcount) {
        if (root == null){
            return;
        }
        int rootIndex = findRootIndexFromInOrder(inOrder, 0, max, root.val);
        postcount--;
        if (min < max) {
            root.left = findRoot(inOrder, postorder, min, rootIndex, postcount);
            root.right = findRoot(inOrder, postorder, rootIndex+1, max, postcount);
            makeTree(root.left, inOrder, postorder, min, rootIndex, postcount );
            makeTree(root.right, inOrder, postorder, rootIndex+1, max, postcount );
        }

    }
}
