package darshita.project.grokking_dsa;


import javafx.scene.Node;

public class DFSpathSum {
    public static boolean pathSum(TreeNode root, int sum) {

        if(root == null){
            return false;
        }
        if(root.value == sum && root.left == null && root.right == null  ){
            return true;
        }
        return pathSum(root.left, sum - root.value) || pathSum(root.right, sum - root.value);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(pathSum(root, 7));
    }
}
