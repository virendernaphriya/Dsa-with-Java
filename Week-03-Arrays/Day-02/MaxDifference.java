public class MaxDifference {
    static int getMaxDiff(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max-min;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7 };
        System.out.println("Max diff is :" + getMaxDiff(arr));
    }
}
