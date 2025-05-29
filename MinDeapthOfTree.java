import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int value = 0;
    TreeNode left;
    TreeNode right;
    TreeNode(int value){
        this.value = value;
    }
}
public class MinDeapthOfTree {
    public static int MinDeapth(TreeNode root){
        int minDeapth = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
           minDeapth++;
           int size = q.size();
           for(int i=0;i<size;i++){
            TreeNode current = q.poll();
           if(current.left==null && current.right == null){
            return minDeapth;
           }
           if(current.left!=null){
            q.offer(current.left);
           }
           if(current.right!=null){
            q.offer(current.right);
           }
           }
        }
        return minDeapth;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        
        System.out.println(MinDeapth(root));

    }
    
}
