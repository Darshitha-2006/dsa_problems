package darshita.project.grokking_dsa;

import java.util.PriorityQueue;

public class KthSmallestNum {
    public static int kthSmall(int[] nums,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
        for(int i=0;i<nums.length;i++){
            if(i<k){
                pq.add(nums[i]);
                continue;
            }
            if(pq.peek()>nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums;
        System.out.println(kthSmall(new int[]{1,2,3903,3,4,1,9,133,6},3));
    }
}
