public class SwapingAlternate {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,7};

        for(int i=0; i<arr.length-1; i+=2){
            // if(i+1==arr.length) break;
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
