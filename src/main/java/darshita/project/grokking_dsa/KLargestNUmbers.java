package darshita.project.grokking_dsa;
import java.util.*;
/* A brute force solution could be to sort the array and return the largest K numbers. The time complexity of such an algorithm will be
O(N∗logN) as we need to use a sorting algorithm like Timsort if we use Java’s Collection.sort().
Usage of sorted deque has worst time complexity than N(logN) */
public class KLargestNUmbers {
    public static Queue<Integer> klargeNums(int[] nums,int k){

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            if(i<k){
                q.add(nums[i]);
                continue;
            }
            if(nums[i]>q.peek()){
                q.poll();
                q.add(nums[i]);
            }
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = klargeNums(new int[]{1,-1,2,9,100,8,5,4,6},3);
        System.out.println(q);
    }
}