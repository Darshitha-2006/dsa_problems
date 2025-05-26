package darshita.project.grokking_dsa;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianHeaps {
    PriorityQueue<Integer> minHeap ;
    PriorityQueue<Integer> maxHeap ;
    public MedianHeaps(){
        maxHeap = new PriorityQueue<Integer>((a,b)->b-a);
        minHeap = new PriorityQueue<Integer>();
    }
    public void insertNum(int val){
        if(maxHeap.isEmpty() || val<=maxHeap.peek()){
            maxHeap.add(val);
        }
        else{
            minHeap.add(val);
        }
        if(minHeap.size()+1<maxHeap.size()){
            minHeap.add(maxHeap.poll());
        }
        else if(minHeap.size()>maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }


    }
    public double getMedian(){
        if(maxHeap.size()==minHeap.size()){
            return (maxHeap.peek() + minHeap.peek()) /2.0;
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        MedianHeaps obj = new MedianHeaps();
        obj.insertNum(1);
        obj.insertNum(2);
        obj.insertNum(3);
        System.out.println(obj.getMedian());
    }
}
