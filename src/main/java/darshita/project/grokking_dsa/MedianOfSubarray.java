package darshita.project.grokking_dsa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MedianOfSubarray {
    static PriorityQueue<Integer> minHeap ;
    static PriorityQueue<Integer> maxHeap ;
    public MedianOfSubarray(){
        maxHeap = new PriorityQueue<Integer>((a,b)->b-a);
        minHeap = new PriorityQueue<Integer>();
    }
    public static List<Double> findMedianSubarray(int[] nums , int k){
        List<Double> ans = new ArrayList<Double>();
        for(int i = 0 ; i <= nums.length-k ; i++){
            Double med = findMedianSubarray(i,i+k-1,nums);
            ans.add(med);
        }
        return ans;
    }
    public static double findMedianSubarray(int start, int end, int[] nums){
        maxHeap.clear();
        minHeap.clear();
        for(int i = start ; i <= end ; i++){
            int val = nums[i];
            if(maxHeap.isEmpty() || val <= maxHeap.peek()){
                maxHeap.add(val);
            }
            else{
                minHeap.add(val);
            }
            if(maxHeap.size()>minHeap.size()+1){
                minHeap.add(maxHeap.poll());
            }
            else if(minHeap.size()>maxHeap.size()){
                maxHeap.add(minHeap.poll());
            }

        }
        if(maxHeap.size()==minHeap.size()){
            return (maxHeap.peek() + minHeap.peek()) /2.0;
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        MedianOfSubarray obj = new MedianOfSubarray();
        System.out.println(obj.findMedianSubarray(new int[]{1,2,3,4,5},2));
    }


}
