package darshita.project.grokking_dsa;

public class SortedArraySq_TwoPointers {
    public static int[] sortedArray(int[] arr){
        int[] res = new int[arr.length];
        int leftptr = 0, rightptr = arr.length - 1;
        int index = arr.length - 1;
        while(leftptr <= rightptr){
            int leftsq = arr[leftptr]*arr[leftptr];
            int rightsq = arr[rightptr]*arr[rightptr];
            if(leftsq > rightsq){
                res[index--] = leftsq;
                leftptr++;
            }
            else{
                res[index--] = rightsq;
                rightptr--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-2,-1,2,4};
        int[] res = sortedArray(arr);
        for(int i : res){
            System.out.println(i);
        }
    }
}
