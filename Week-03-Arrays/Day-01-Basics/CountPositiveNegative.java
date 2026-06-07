public class CountPositiveNegative {
    public static void main(String[] args) {
        int pCount=0; 
        int nCount=0;

        int[] arr = {1,2,-4,3,-6, 9,-10 ,0};

        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                nCount++;
            }else if(arr[i]>0){
                pCount++;
            }
        }

        System.out.println("Negative nums in arr "+ nCount);
        System.out.println("Positive nums in arr "+ pCount);
    }
}
