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
public class levelAvg {
    public static List<Double> AvgInLevs(TreeNode root){
        List<Double> ans = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int sum=0;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                sum += current.value;
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
            }
            double result = (double) sum / size;
            ans.add(result);
            

        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<Double> ans = AvgInLevs(root);
        System.out.println(ans);

    }
}
