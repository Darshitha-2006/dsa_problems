import java.util.ArrayList;
import java.util.List;

public class AllDups {
    public static List<Integer> allDups(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int start=0;
        while(start<nums.length){
            if(nums[start]!=nums[nums[start]-1]){
                swap(nums , start, nums[start]-1 );
            }
            else{ 
                start++;
            }

        }
        
        for(int i = 0; i<nums.length ; i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
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
        int[] nums = new int[]{5, 4, 7, 2, 3, 5, 3};
        System.out.println(allDups(nums));
    }
}
