import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cyclicSortAllMiissingNums {
    public static List<Integer> allMissingNums(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int max = Arrays.stream(nums).max().getAsInt();
        int start = 0;
        while(start<nums.length){
            if(nums[start]<nums.length && nums[start]!=nums[nums[start]]){
                swap(nums , start, nums[start] );
            }
            else{
                start++;
            }
        }
        boolean[] present = new boolean[max + 1];
        for (int num : nums) {
            if (num <= max) present[num] = true;
        }

        for (int j = 0; j <= max; j++) {
            if (!present[j]) {
                ans.add(j); // missing number
            }
        }

        return ans;
    }
    public static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] =nums[j];
        nums[j] = temp;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,4,5,8};
        System.out.println(allMissingNums(nums));
    }
    
}
