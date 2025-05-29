public class cyclicSort {
    public static void sort(int[] nums){
        int start = 0;
        while(start<nums.length){
            if(nums[start]!= start+1){
                swap(nums,start , nums[start]-1);
            }
            else if(nums[start]==start+1){
                start++;
            }
        }
        
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,4,1,3};
        sort(nums);
        for(int n:nums){
            System.out.println(n);
        }
    }
    
}
