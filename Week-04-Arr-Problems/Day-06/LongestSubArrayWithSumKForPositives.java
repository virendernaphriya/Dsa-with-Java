public class LongestSubArrayWithSumKForPositives {
    // optimal solution using two pointers for positive integers only

    static int getLongestSumWithK(int arr[], int k) {
        // Steps :-
        // 1-> iterate through arr and calculate sum
        // compare the sum with k
        // if sum is greater then k then remove elements from left until it becomes smaller then k

        int sum = 0;
        int len = 0;
        int left = 0;
        for (int right = left; right < arr.length; right++) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                len = Math.max(len, right - left + 1);
            }

        }

        return len;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,1,1,1,1,3,3};
        System.out.println(getLongestSumWithK(arr, 7));
    }
}
