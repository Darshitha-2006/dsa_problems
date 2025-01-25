package darshita.project.grokking_dsa;

import java.util.HashMap;

public class SlidingWindow_problem1 {
    public static boolean permutation(String a, String b) {
        boolean ans = true;
        HashMap<Character, Integer> mapa = new HashMap<>();
        HashMap<Character, Integer> mapb = new HashMap<>();
        for(Character c : a.toCharArray()) {
            mapa.put(c, mapa.getOrDefault(c, 0) + 1);
        }
        for(Character c : b.toCharArray()) {
            mapb.put(c, mapb.getOrDefault(c, 0) + 1);
        }
        for(Character c : mapb.keySet()) {
            if(mapa.getOrDefault(c,0)<mapb.get(c)) {
                ans = false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String a = "abcdas";
        String b = "abecd";
        System.out.println(permutation(a, b));
    }
}
