package darshita.project.grokking_dsa;
import java.util.*;
public class AnagramList {
    public static List<Integer> anagramIndicesList(String a , String b){
        List<Integer> resultIndices = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : b.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int windowStart = 0;
        int windowEnd = 0 , matched =0;
        for(windowEnd = 0 ; windowEnd < a.length() ; windowEnd++){
            Character c = a.charAt(windowEnd);
            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
                if(map.get(c) == 0){
                    matched++;
                }
            }
            if(matched == map.size()){
                resultIndices.add(windowStart);
            }
            if(windowEnd>=b.length()-1){
                Character cleft = a.charAt(windowStart++);
                if(map.containsKey(cleft)){

                    if(map.get(cleft) == 0){
                        matched--;
                    }
                    map.put(cleft, map.get(cleft) + 1);
                }
            }
        }
        return resultIndices;
    }
    public static void main(String[] args) {
        String a = "ppqp";
        String b = "pq";
        System.out.println(anagramIndicesList(a,b));
    }
}
