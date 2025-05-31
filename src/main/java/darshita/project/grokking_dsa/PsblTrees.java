package darshita.project.grokking_dsa;

import java.util.ArrayList;
import java.util.List;

public class PsblTrees {
    public static int GenerateTrees(int n) {
        List<TreeNode> trees = new ArrayList<TreeNode>();
        if(n<=0) return 1;
        return findTreesRec(1,n).size();
    }
    public static List<TreeNode> findTreesRec(int start, int end) {
        List<TreeNode> trees = new ArrayList<>();
        if(start>end){
            trees.add(null);
            return trees;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> leftTrees = findTreesRec(start,i-1);
            List<TreeNode> rightTrees = findTreesRec(i+1,end);
            for(TreeNode leftTree: leftTrees){
                for(TreeNode rightTree: rightTrees){
                    TreeNode node = new TreeNode(i);
                    node.left = leftTree;
                    node.right = rightTree;
                    trees.add(node);
                }
            }
        }
        return trees;
    }
    public static void main(String[] args) {
       System.out.println(GenerateTrees(3));

    }
}
