package darshita.project.grokking_dsa;

import java.util.*;

public class LongestSubstring_SlidingWindow {
    public static int longestSubstring(String s, int k) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int n = s.length(), windowStart = 0, windowEnd = 0 , count = 0;

        for(windowEnd = 0; windowEnd < n; windowEnd++) {
            char c = s.charAt(windowEnd);
            if (map.containsKey(c)) {
                // Move the window start to the right of the last occurrence of `c`
                windowStart = Math.max(windowStart, map.get(c) + 1);
            }

            // Add the current character to the map
            map.put(c, windowEnd);

            count = Math.max(count, windowEnd - windowStart+1);

        }
        return count;
    }
    public static void main(String[] args) {
        String str ="abbbb";
        System.out.println(longestSubstring(str, 2));
    }
}
