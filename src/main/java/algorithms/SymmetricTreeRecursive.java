package algorithms;

/**
 * Created by rkarnati on 4/12/17.
 */
public class SymmetricTreeRecursive {

    public boolean isSymmetric(TreeNode root) {

        if (root == null){
            return true;
        }
        return isSym(root.left, root.right);

    }
    public boolean isSym(TreeNode p, TreeNode q){
        if (p==null && q==null) return true;
        if (p != null){
            if (q==null) return false;
        } else if (q != null){
            return false;
        }
        if (p.val != q.val) return false;
        return isSym(p.left, q.right) && isSym(p.right, q.left);

    }
}
