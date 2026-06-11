public class LastOccurence {
    static int getLastOcc(int[] arr,int n){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={2,1,4,5,6,5,4};
        int n=5;
        System.out.println(getLastOcc(arr, n));
    }
}
