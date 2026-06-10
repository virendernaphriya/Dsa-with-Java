public class SeperateEvenOdd {
    public static void main(String[] args) {

        //we can consider this problem in two ways 
        //1. move evens to the start
        //2. move odds to the end
        int[] arr = {2,3,5,6,8,1};
        int i=0;
        int last=arr.length-1;

        while (i<last) {
            if(arr[i]%2 != 0){
                int temp= arr[i];
                arr[i] = arr[last];
                arr[last]=temp;
                last--;
            }else{
                i++;
            }
        }


        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+",");
        }
    }
}
