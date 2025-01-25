package darshita.project.grokking_dsa;
import java.util.*;

public class ZeroSumTriplets_TwoPointer {
    public static List<List<Integer>> tripletsWithSum0(int[] arr){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0 ; i<arr.length; i++ ){
            if(i>0 && arr[i]==arr[i-1]){
                continue; //skip same element to avoid dup
            }
            searchPairs(arr,-arr[i],i+1,res);
        }
        return res;
    }
    public static void searchPairs(int[] arr, int sum, int start, List<List<Integer>> res){
        int left = start;
        int right = arr.length-1;
        while(left < right){
            if(arr[left]+arr[right]==sum){
                res.add(Arrays.asList(-sum,arr[left], arr[right]));
                left++;
                right--;
                while(left<right && arr[left]==arr[left+1]){
                    left++; //skip same element to avoid dup
                }
                while(left<right && arr[right]==arr[right-1]){
                    right--; //skip same element to avoid dup
                }
            }
            else if(arr[left]+arr[right]>sum){
                left++;

            }
            else{
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-5,2,-1,-2,3};
        System.out.println(tripletsWithSum0(arr));
    }
}
