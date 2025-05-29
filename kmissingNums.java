import java.util.*;
public class kmissingNums {
    public static List<Integer> kMissingNums(int[] nums,int k){
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }
            else{
                i++;
            }
        }
        Set<Integer> extraNums = new HashSet<>();
        for(int j =0;j<nums.length && ans.size()<k ; j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
                extraNums.add(nums[j]);
            }
        }
        for(int l =1; ans.size()<k;l++){
            int Number = l+nums.length;
            if(!extraNums.contains(Number)){
                ans.add(Number);
            }
        }
        return ans;

    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,4};
        System.out.println(kMissingNums(nums,3));
    }
    
}
