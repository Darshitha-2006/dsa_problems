package darshita.project.grokking_dsa;

import java.util.PriorityQueue;

public class ConnectingRopes {
    public static int ropeLen(int[] nums){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int len =0, temp =0;
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        while(pq.size()>1){
            temp = pq.poll()+pq.poll();
            len+=temp;
            pq.add(temp);
        }
        return len;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 11, 5};
        System.out.println(ropeLen(nums));
    }
}
