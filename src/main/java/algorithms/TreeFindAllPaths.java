package algorithms;

import java.util.*;

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

}
