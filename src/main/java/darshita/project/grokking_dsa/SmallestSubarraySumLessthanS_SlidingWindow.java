package darshita.project.grokking_dsa;

public class SmallestSubarraySumLessthanS_SlidingWindow {
    public static int smallestSubarraySize(int[] arr , int S){
        int windowStart = 0 , windowSize = Integer.MAX_VALUE , windowSum = 0 ;
        for(int windowEnd = 0 ; windowEnd < arr.length ; windowEnd++){
            windowSum += arr[windowEnd];
            while(windowSum >= S){
                windowSize = Math.min(windowEnd - windowStart + 1 , windowSize);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return windowSize == Integer.MAX_VALUE ? 0 : windowSize;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,2,3,2};
        System.out.println(smallestSubarraySize(arr , 7));
    }
}
