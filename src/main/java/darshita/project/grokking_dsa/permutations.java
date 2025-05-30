package darshita.project.grokking_dsa;
import java.util.*;
public class permutations {
    public static List<List<Integer>> Permutations(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<List<Integer>> perms = new LinkedList<>();
        perms.add(new ArrayList<>());
        for(int currNum : nums){
            int size = perms.size();
            for(int i = 0; i < size; i++){
                List<Integer> oldPerm = perms.poll();

                for(int j = 0; j <= oldPerm.size(); j++){
                    List<Integer> newPerm = new ArrayList<>(oldPerm);
                    newPerm.add(j, currNum);
                    if(newPerm.size() == nums.length){
                        ans.add(newPerm);
                    }
                    else{
                        perms.add(newPerm);
                    }

                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> permutations = Permutations(nums);
        System.out.println(permutations);
    }
}
