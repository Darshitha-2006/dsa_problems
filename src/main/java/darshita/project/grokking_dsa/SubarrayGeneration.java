package darshita.project.grokking_dsa;
import java.util.*;
public class SubarrayGeneration {
    public static List<List<Integer>> subarrays(int[] arr) {
         List<List<Integer>> ans = new ArrayList<>();
         ans.add(new ArrayList<>());
         for(int num : arr){
             int size = ans.size();
             for(int i = 0; i < size; i++){
                 List<Integer> sub = new ArrayList<>(ans.get(i));
                 sub.add(num);
                 ans.add(sub);
             }

         }
         return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> ans = subarrays(arr);
        System.out.println(ans);
    }
}
