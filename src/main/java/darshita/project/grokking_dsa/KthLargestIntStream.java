package darshita.project.grokking_dsa;

import java.util.PriorityQueue;
class KthLargestIntStream {
    private final PriorityQueue<Integer> pq = new PriorityQueue<>();
    private final int k;
    public KthLargestIntStream(int[] nums, int k){
        this.k = k;
        for(int i=0; i<nums.length; i++){
            add(nums[i]);
        }
    }
    public int add(int num){
        pq.add(num);
        if(pq.size()> this.k){
           pq.poll();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 12, 2, 11};
        KthLargestIntStream kthLargest = new KthLargestIntStream(nums, 4);
        System.out.println(kthLargest.add(6));
    }
}
