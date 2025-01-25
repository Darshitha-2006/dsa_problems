package darshita.project.grokking_dsa;


import java.util.*;

public class LongestSubarrayKdistinct_SlidingWindow {

    public static int longestSubarray(String str, int k) {



        if (str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
        Map<Character,Integer> map = new HashMap<>();
        int n = str.length(), windowStart = 0,maxLen = Integer.MIN_VALUE,windowEnd =0;
        for( windowEnd = 0; windowEnd < n; windowEnd++){
            char ch = str.charAt(windowEnd);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.get(ch) > k){
                ch = str.charAt(windowStart);
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
                windowStart++;
            }

        }
        return Math.max(windowEnd - windowStart + 1 ,maxLen);
    }
    public static void main(String[] args) {
        String stri = "araaci";
        int k = 3;
        System.out.println(longestSubarray(stri, k));
    }
}
