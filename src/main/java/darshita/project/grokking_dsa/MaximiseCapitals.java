package darshita.project.grokking_dsa;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximiseCapitals {

    public static int getMaxCapital(int[] projects, int[] profits, int proj , int initialCap) {
        PriorityQueue<Integer> maxHeap;
        PriorityQueue<Integer> minHeap;

            maxHeap = new PriorityQueue<Integer>((a,b) -> b-a);
            minHeap = new PriorityQueue<>();

        for(int i = 0;i<projects.length;i++){
            minHeap.offer(projects[i]);
        }
        int availableCap = initialCap;
        for(int i=0; i<proj;i++){
            while(!minHeap.isEmpty() && projects[minHeap.peek()]<=availableCap){
                maxHeap.add(minHeap.poll());
                if(maxHeap.isEmpty()){
                    break;
                }
                availableCap += profits[maxHeap.poll()];
            }
        }
        return availableCap;



    }

    public static void main(String[] args) {
        int res = MaximiseCapitals.getMaxCapital(new int[] {0,1,2},new int[] {1,2,3} , 2,1);
        System.out.println(res);
    }
}
