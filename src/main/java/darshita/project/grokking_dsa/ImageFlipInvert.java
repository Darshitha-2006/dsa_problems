package darshita.project.grokking_dsa;

import java.util.Arrays;

public class ImageFlipInvert {
   /* public static int[][] imageInvFlip(int[][] image) {


        for(int[] row : image){
            flip(row);
            inv(row);

        }
        return image;

    }
    public static void flip(int[] row){
        int left = 0;
        int right = row.length - 1;

        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;

            // Move inward
            left++;
            right--;
        }
    }
    public static void inv(int[] row){
        for(int i=0; i<row.length; i++){
            row[i] ^=1;
        }
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{{1,0,0},{0,1,0},{0,0,1}};
        int[][] imageInv = imageInvFlip(image);
        for(int i = 0 ; i < imageInv.length ; i++){
            for(int j = 0 ; j < imageInv[i].length ; j++){
                System.out.print(imageInv[i][j]+" ");

            }
            System.out.println();
        }
    }
    The above approach has time complexity O(m.n) . The optimised sol is given below.
    */
    public static int[][] flipAndInvertImage(int[][] image) {
        int size= image[0].length;
        for(int[] row: image) {
            for(int j=0;j<(size+1)/2;++j) {
                int temp = row[j]^1;
                row[j] = row[size-1-j]^1;
                row[size-1-j] = temp;

            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
}



