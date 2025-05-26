package darshita.project.grokking_dsa;

import java.util.ArrayList;
import java.util.List;

public class SumPaths {
    public static List<List<Integer>> sumPaths(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        findPathsRec(root, sum, result,list);
        return result;
    }

    public static void findPathsRec(TreeNode current, int sum,List<List<Integer>> result, List<Integer> path) {
        if (current == null) {
            return;
        }
        path.add(current.value);
        if(current.left == null && current.right == null && sum == current.value) {
            result.add(new ArrayList<>(path));
        }
        else{
            findPathsRec(current.left, sum-current.value, result, path);
            findPathsRec(current.right, sum-current.value, result, path);
        }
        path.remove(path.size()-1);

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(sumPaths(root, 8));
    }
}
