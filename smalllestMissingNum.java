public class smalllestMissingNum {
    public static int smallMissNum(int[] nums){
        int start=0;
        while(start<nums.length){
            if(nums[start]>0 && nums[start]<=nums.length && nums[start]!=nums[nums[start]-1]){
                swap(nums,start,nums[start]-1);
            }
            else{
                start++;
            }
        }
        for(int i=0;i<nums.length ; i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;     
    }
    public static void swap(int[] nums, int i , int j){
        int temp=nums[i];
        nums[i] =nums[j];
        nums[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{-3, 1, 5, 4, 2};
        System.out.println(smallMissNum(nums));
    }
    
}
