public class LongestSubArraySum {
    static int getLongestSumWithK(int s, int arr[]) {
        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                // for (int k = i; k <= j; k++) {
                //     sum += arr[k];
                // }
                if (sum == s) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        System.out.println(getLongestSumWithK(10, arr));
    }
}
