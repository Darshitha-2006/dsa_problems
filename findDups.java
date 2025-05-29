public class findDups {
    public static int dup(int[] nums){
        int start =0;
        while(start<nums.length){
            if (nums[start] != nums[nums[start] - 1]) {
                swap(nums, start, nums[start] - 1);
            } else {
                start++;
            }
            
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]!=i+1){
                return nums[i];
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
        int[] nums = new int[]{1, 4, 4, 3, 2};
        System.out.println(dup(nums));
    }
    
}
