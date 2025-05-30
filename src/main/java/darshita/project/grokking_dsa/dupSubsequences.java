package darshita.project.grokking_dsa;
import java.util.*;

public class dupSubsequences {
    public static List<List<Integer>> dupsubsequences(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        int strt = 0, end = 0;
        for(int i = 0; i < nums.length; i++) {
            strt = 0;
            if(i>0 && nums[i] == nums[i-1]) {
                strt = end+1;
            }
            end = ans.size()-1;
            for(int j = strt;j<=end;j++) {
                List<Integer> tmp = new ArrayList<>(ans.get(j));
                tmp.add(nums[i]);
                ans.add(tmp);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,3};
        List<List<Integer>> ans = dupsubsequences(nums);
        System.out.println(ans);
    }
}
