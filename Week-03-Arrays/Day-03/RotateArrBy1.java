public class RotateArrBy1 {
    static void rightShift(int[] arr) {
        // int start = 0;
        // for (int i = 1; i < arr.length; i++) {
        // int temp = arr[i];
        // arr[i] = arr[start];
        // arr[start] = temp;
        // }

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    static void LeftShift(int[] arr) {
        // int last = arr.length - 1;
        // for (int i = last - 1; i >= 0; i--) {
        // int temp = arr[i];
        // arr[i] = arr[last];
        // arr[last] = temp;
        // }

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // System.out.println("Right shift >>>>>>>>>>>>>>>>>>>>>>>>>>>.");
        // rightShift(arr);
        System.out.println("Left Shift>>>>>>>>>>>>>>>>>>>>>>>>>>");
        LeftShift(arr);
    }
}
