public class tets {
    public static int xor1toN(int n){
        switch (n%4) {
            case 0:
                return n;
                
            case 1:
                return 1;
                    
            case 2:
                return n+1;
            case 3:
                return 0;    
            default:
                return -1;
                
        }
    }

    public static void main(String[] args) {
        int X1 = xor1toN(5);
        int[] nums ={1,2,4,5};
        int X2 = nums[0];
        for(int i=1;i<nums.length ; i++){
            X2 = X2^nums[i];
        }
        System.out.println(X1^X2);
    }
    
}
