package darshita.project.grokking_dsa;

public class MaxSumSubarray_SlidingWindow {
    public static int maxSumSubarray(int[] A, int K) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int windowStart = 0;
        for(int windowEnd = 0 ; windowEnd < A.length; windowEnd++) {
            sum += A[windowEnd];
            if(windowEnd>=K-1){
                maxSum = Math.max(maxSum, sum);
                sum -= A[windowStart];
                windowStart++;
            }
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(maxSumSubarray(A, 3));
    }
}
