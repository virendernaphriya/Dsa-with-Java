public class RotateArray {

    
    static void leftRotateBy1(int[] arr){
        int first=arr[0];
        int last=arr.length-1;
        for(int i=0; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }

        arr[last]=first;
    }
    static void rightRotateBy1(int[] arr){
        int first=0;
        int last=arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }

        arr[first]=last;
    }


    public static void main(String[] args) {
        int arr[] = {2,3,4,3,5,6};
        rightRotateBy1(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}