package algorithms;

import java.util.Stack;

/**
 * Created by rkarnati on 4/12/17.
 */
public class SymmetricTree {

    public boolean isTreeSymmetric(TreeNode root){

        TreeNode left;
        TreeNode right;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root ==  null) return true;
        if (root != null) {
            left = root.left;
            right = root.right;
            if(left!=null){
                if (right == null) return false;
                stack.push(left);
                stack.push(right);
            } else if (right!=null){
                return false;
            }
        }


        while (!stack.empty()){
            if (!(stack.size()%2 == 0)) {
                right = stack.pop();
                left = stack.pop();
                if (right.val != left.val) return false;
            } else {
                return false;
            }

            if(left.left!=null){
                if (right.right== null) return false;
                stack.push(left.left);
                stack.push(right.right);
            } else if (right.right != null) {
                return false;
            }

            if(left.right!=null){
                if (right.left== null) return false;
                stack.push(right.left);
                stack.push(left.right);
            } else if (right.left != null){
                return false;
            }

        }
        return true;
    }
}
