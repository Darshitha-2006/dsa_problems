package darshita.project.grokking_dsa;
import java.util.*;

public class ProductLessThanTarget_TwoPointers {
    public static List<List<Integer>> integerList(int[] arr, int target) {
        int n = arr.length, left = 0, right = n - 1, subprdct = 1;
        List<List<Integer>> ans = new ArrayList<>();
        while(left <= right) {

            subprdct = arr[left]*arr[right];
            if(subprdct == target) {
                List<Integer> lst = new ArrayList<>();
                lst.add(arr[left]);
                lst.add(arr[right]);
                ans.add(lst);
                left++;
                right--;
            }
            else if(subprdct < target) {
                left++;
            }
            else{
                right--;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,10};
        System.out.println(integerList(arr, 30));
    }
}
