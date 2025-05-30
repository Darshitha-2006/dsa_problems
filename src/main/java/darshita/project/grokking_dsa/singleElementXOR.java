package darshita.project.grokking_dsa;

public class singleElementXOR {
    public static int element(int[] nums){
        int num=0;
        for(int i = 0; i<nums.length; i++){
            num = num^nums[i];

        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};
        System.out.println(element(nums));
    }
}
