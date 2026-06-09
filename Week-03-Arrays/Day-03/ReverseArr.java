public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 8, 5, 14 };

        // two pointer
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
