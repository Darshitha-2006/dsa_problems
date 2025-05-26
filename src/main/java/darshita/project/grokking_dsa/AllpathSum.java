package darshita.project.grokking_dsa;

public class AllpathSum {
    public static int pathSum(TreeNode root){

         return findPathSum(root ,0);

    }
    public static int findPathSum(TreeNode current, int sum){
        int SumPath =0;
        if(current == null){
            return 0;
        }
        SumPath = 10*SumPath + current.value;
        if(current.left == null && current.right == null){
            return SumPath;
        }
        return findPathSum(current.left,SumPath) + findPathSum(current.right,SumPath);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(pathSum(root));
    }
}
