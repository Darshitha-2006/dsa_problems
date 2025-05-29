import java.util.ArrayList;
import java.util.List;

public class corruptPair {
    public static List<Integer> corruptPair(int[] nums){
        int start = 0;
        while(start<nums.length){
            if(nums[start]!=nums[nums[start]-1]){
                swap(nums,start, nums[start]-1);
            }
            else{
                start++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i =0; i<nums.length ; i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
                ans.add(i+1);
            }
        }
        return ans;
    }
    public static void swap (int[] nums, int i , int j){
        int temp=nums[i];
        nums[i] =nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 3, 6, 4};
        System.out.println(corruptPair(nums));
    }
    
}
