public class FirstOccurence {
    static int getFirstOcc(int[] arr , int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={2,3,4,9,4};
        int n=4;
        System.out.println(getFirstOcc(arr, n));
    }
}
