package darshita.project.grokking_dsa;
import java.util.*;
public class TopKFreqElements {
    public static List<Integer> kElem(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>((e1,e2)->e1.getValue()- e2.getValue());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            pq.add(entry);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        while(!pq.isEmpty()) {
            list.add(pq.poll().getKey());
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 12, 11, 12, 11};
        System.out.println(kElem(nums, 2));
    }
}
