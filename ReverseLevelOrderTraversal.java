import java.util.*;
class TreeNode{
    int value = 0;
    TreeNode left;
    TreeNode right;
    TreeNode(int value){
        this.value = value;
    }
}
public class ReverseLevelOrderTraversal {
    public static List<List<Integer>> revLevTrav(TreeNode root){
        List<List<Integer>>ans= new LinkedList<List<Integer>>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<levelSize;i++){
                TreeNode current = q.poll();
                list.add(current.value);
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
            }
            ans.add(0,list);
            
        }
        return ans;

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<List<Integer>> ans = revLevTrav(root);
        System.out.println(ans);

    }
}
