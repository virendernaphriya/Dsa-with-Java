public class MinDifference {
    static int getMinDiff(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = arr[i] - arr[j];
                if (minDiff > Math.abs(diff)) {
                    minDiff = Math.abs(diff);
                }
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 15};
        System.out.println("Min Diff is : "+ getMinDiff(arr));
    }
}
