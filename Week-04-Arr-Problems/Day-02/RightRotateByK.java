public class RightRotateByK {
    static void reverseArr(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rightRotateByK(int arr[], int k) {
        int n = arr.length;
        k %= n;
        // reverse array from 0 to n-k-1
        reverseArr(arr, 0, n - k - 1);
        //reverse array from n-k+1
        reverseArr(arr, n-k, n-1);
        // reverse the whole arr
        reverseArr(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rightRotateByK(arr, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
