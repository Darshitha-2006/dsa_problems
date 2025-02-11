package darshita.project.grokking_dsa;

import java.util.Arrays;

public class TripletSmallerSum {
    public static int tripletSmallerSum(int[] arr , int targetSum) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length-2; i++) {
            count += searchPair(arr,targetSum- arr[i] , i );
        }
        return count;
    }

    private static int searchPair(int[] arr, int target , int first) {
        int count = 0;
        int left = first+1;
        int right = arr.length-1;
        while (left <= right) {
            if(arr[left] + arr[right] < target) {
                count += right - left;
                left++;
            }
            else{
                right--;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,2,3};
        System.out.println(tripletSmallerSum(arr , 3));
    }
}
