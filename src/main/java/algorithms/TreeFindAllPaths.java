package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rkarnati on 4/13/17.
 */
public class TreeFindAllPaths {

    List<List<Integer>> allPaths = new ArrayList<List<Integer>>();

    public List<List<Integer>> findPaths(TreeNode root) {
        List<List<Integer>> allPaths = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        getPaths(root, path);
        return allPaths;
    }
    public void getPaths(TreeNode root, List<Integer> path ) {
        if (root == null) {
            return;
        }
        if (root != null) {
            path.add(root.val);
        }
        if (root.left == null && root.right == null) {
                allPaths.add(path);
        } else {
            getPaths(root.left, path);
            getPaths(root.right, path);
        }
    }

    public List<List<Integer>> printAllPaths(TreeNode root){
        int arr[] = new int[1000];
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        getAllPaths(root, arr, 0, paths);
        return paths;
    }

    private void getAllPaths(TreeNode root, int[] a, int printLen, List<List<Integer>> paths ){

        if (root == null) return;
        if (root!= null) {
            a[printLen] =root.val;
            printLen++;
        }
        if (root.right == null && root.left == null) {
            ArrayList<Integer> path = new ArrayList<Integer>();
            for (int i =0;i<printLen;i++) path.add(a[i]);
            paths.add(path);
        }

        getAllPaths(root.left, a, printLen, paths);
        getAllPaths(root.right, a, printLen, paths);
    }
}
