public class SubArrayCountWithSumK {
    static int subArrayCountBrute(int arr[], int Ksum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == Ksum) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1 };
        System.out.println(subArrayCountBrute(arr, 2));
    }
}
