package darshita.project.grokking_dsa;

import java.util.HashMap;
import java.util.*;

public class FruitsInBasket_SlidingWindow {
    public static int fruitBasket(char[] fruits) {
        int count = 0, n = fruits.length;
        int windowStart = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int windowEnd;
        for (windowEnd = 0; windowEnd < n; windowEnd++) {
            char fruit = fruits[windowEnd];
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
            while (map.size() > 2) {
                char fruit2 = fruits[windowStart];
                map.put(fruit2, map.get(fruit2) - 1);
                if (map.get(fruit2) == 0) {
                    map.remove(fruit2);
                }
                windowStart++;
            }
        }
        return Math.max(windowEnd - windowStart , count);
    }
    public static void main(String[] args) {
        char[] Fruit = {'A', 'B', 'C', 'B', 'B', 'C'};
        System.out.println(fruitBasket(Fruit));
    }
}
