package darshita.project.grokking_dsa;

import java.util.ArrayList;
import java.util.List;

public class NumberOfpathsOfSum {
    public static int countPaths(TreeNode root, int sum) {
        List<Integer> paths = new ArrayList<Integer>();
        if (root == null) return 0;
        return paths(root,sum,paths);
    }

    public static int paths(TreeNode current, int sum,List<Integer> paths) {
        if (current == null) return 0;
        int count =0 , pathSum =0;
        paths.add(current.value);
        if(current.left == null && current.right == null && sum == pathSum) {
            count++;
        }
        return 1;

    }
}
