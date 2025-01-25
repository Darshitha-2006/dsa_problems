package darshita.project.grokking_dsa;

import java.util.HashMap;

public class SmallestSubstring_SlidingWindow {
    public static String smallestSubstring(String a , String b) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(Character c : b.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int windowStart = 0 , windowEnd = 0 ;
        int matched = 0, minLen = Integer.MAX_VALUE , subStart = 0;
        for(windowEnd = 0 ; windowEnd < a.length() ; windowEnd++) {
            Character c = a.charAt(windowEnd);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if(map.get(c) >= 0) {
                    matched++;
                }
            }
           while(matched == b.length()) {
               if(minLen > windowEnd - windowStart+1) {
                   minLen = windowEnd - windowStart+1;
                   subStart = windowStart;
               }
               Character c2 = a.charAt(windowStart++);
               if(map.containsKey(c2)) {
                   if(map.get(c2) == 0) {
                       matched--;
                   }
                   map.put(c2, map.get(c2) + 1);
               }


           }
        }
        return minLen==Integer.MIN_VALUE?"":a.substring(subStart, subStart + minLen);
    }
    public static void main(String[] args) {
        String a = "aabdec";
        String b = "abd";
        System.out.println(smallestSubstring(a, b));
    }
}
