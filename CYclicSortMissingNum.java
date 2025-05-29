public class CYclicSortMissingNum {
    public static int missingNum(int[] nums){
        int start = 0;
        while(start<nums.length){
            if(nums[start]<nums.length && nums[start]!=nums[nums[start]]){
                swap(nums , start, nums[start] );
            }
            else{
                start++;
            }
        }
        for(int i = 0; i<nums.length ; i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return -1;
    }
    public static void swap (int[] nums, int i , int j){
        int temp=nums[i];
        nums[i] =nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{4,0,3,1};
        System.out.println(missingNum(nums));
    }
    
}
