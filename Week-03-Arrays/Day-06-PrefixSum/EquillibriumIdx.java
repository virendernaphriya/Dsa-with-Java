public class EquillibriumIdx {
    static int getIdx(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            totalSum -= nums[i]; // this is our right sum
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6, 1, -1 };
        System.out.println(getIdx(arr));
    }
}