package darshita.project.grokking_dsa;
import java.util.*;
public class TargetSum_TwoPointers {
    public static List<Integer> targetSum(List<Integer> list , int k){
        List<Integer> ans = new ArrayList<>();
        int left = 0 , right = list.size()-1, sum = 0;
        while(left < right){
            sum = list.get(left)+list.get(right);
            if(sum<k){
                left++;
            }
            if(sum>k){
                right--;
            }
            if(sum==k){
                ans.add(list.get(left));
                ans.add(list.get(right));
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(targetSum(list , 6));
    }
}
