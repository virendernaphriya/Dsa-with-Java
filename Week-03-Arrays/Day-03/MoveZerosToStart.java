public class MoveZerosToStart {
    public static void main(String[] args) {
        int[] arr = { 0, 4, 5, 0, 3, 0, 0 };

        int start = 0;

        int i = arr.length - 1;
        while (i > start) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
            } else {
                i--;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}