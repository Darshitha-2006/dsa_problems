import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int value = 0;
    TreeNode left;
    TreeNode right;
    TreeNode(int value){
        this.value=value;
    }
}
public class levOrderSuccessor {
    public static int levOrderSucessor(TreeNode root, int key){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
                if(current.value == key){
                    break;
                }
            
        }
        return q.peek().value;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        int ans = levOrderSucessor(root,1);
        System.out.println(ans);

    }
}
