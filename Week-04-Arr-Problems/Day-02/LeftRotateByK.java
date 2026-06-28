public class LeftRotateByK {

    static void reverseArr(int arr[], int start , int end){
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void lRotateByK(int k, int[] arr) {
        //we can get lRotatedArrayByK in three steps

        int n= arr.length;
        k =k%n;
        //1. reverse the array from 0 to k-1
        reverseArr(arr, 0, k-1);
        //2. reverse the array from k to n-1
        reverseArr(arr, k, n-1);
        //3. reverse the complete array
        reverseArr(arr, 0, n-1);
    }

    static void lRotateByKBrute(int k, int[] arr) {
        int n = arr.length;
        k = k % n;
        int temp[] = new int[k];
        // store the first k elements in a temp arr
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // start from k-1 idx and move all element k places before
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }

        // place the temp arr after the three variables
        // int start = 0;
        // for (int i = n - k; i < arr.length; i++) {
        //     arr[i] = temp[start];
        //     start++;
        // }

        //better approach
        for (int i = 0; i < temp.length; i++) {
            arr[n-k+i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        lRotateByK(3, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}