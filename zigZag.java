import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class TreeNode{
    int value = 0;
    TreeNode left;
    TreeNode right;
    TreeNode(int value){
        this.value = value;
    }
}
public class zigZag {
    public static List<List<Integer>> zigzag(TreeNode root){
        List<List<Integer>> ans = new LinkedList<>();
        Deque<TreeNode> dq = new LinkedList<>();
        dq.offer(root);
        int k = 1;
        while(!dq.isEmpty()){
            List<Integer> list = new LinkedList<>();
            int size = dq.size();
            
                
                for(int i = 0; i<size ; i++){
                    TreeNode current = null;
                    if(k%2!=0){
                        current = dq.pollFirst();
                        list.add(current.value);
                       if(current.left!=null){
                dq.offerLast(current.left);
            }
            if(current.right!=null){
                dq.offerLast(current.right);
            }      
                    } 
                    if(k%2==0){
                        current = dq.pollLast();
                        list.add(current.value);
                        if(current.left!=null){
                dq.offerFirst(current.left);
            }
            if(current.right!=null){
                dq.offerFirst(current.right);
            }     
                    }  
                          
                }
                ans.add(list);
                k++;
            
            
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
        List<List<Integer>> ans = zigzag(root);
        System.out.println(ans);

    }
}
