package algorithms;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by rkarnati on 4/11/17.
 */
public class BinaryTraversalNonRecursive {


    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> inOrder = new ArrayList<Integer>();
        if (root == null) return inOrder;
        Stack<TreeNode> inStack = new Stack<TreeNode>();
        TreeNode current = root;
        while (current != null){
            inStack.push(current);
            current = current.left;
            while (current == null && inStack.size() != 0){
                current = inStack.pop();
                inOrder.add(current.val);
                current = current.right;
            }
        }
        return inOrder;
    }

    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<Integer>();
        if (root == null) return preOrder;

        Stack<TreeNode> preStack = new Stack<TreeNode>();
        TreeNode current = root;
        preStack.push(current);
        while (preStack.size() != 0){
            current = preStack.pop();
            preOrder.add(current.val);
            if (current.right != null) preStack.push(current.right);
            if (current.left != null) preStack.push(current.left);

        }


        return preOrder;
    }


    public List<Integer> postOrderTraversal(TreeNode root) {

        List<Integer> postOrder = new ArrayList<Integer>();
        if (root == null) return postOrder;
        TreeNode current = root;
        TreeNode peekNode = null;
        Stack<TreeNode> postStack = new Stack<TreeNode>();

        while (current != null) {
            if (current.right != null) postStack.push(current.right);
            postStack.push(current);
            current = current.left;
            while (current == null) {
                current = postStack.pop();
                peekNode = postStack.peek();
                if (current.right == peekNode) {
                    postStack.pop();
                    postOrder.add(peekNode.val);
                    postStack.push(current);
                    current = peekNode;
                } else {
                    postOrder.add(current.val);
                    current = null;
                }
            }
        }
        return postOrder;



    }

}
