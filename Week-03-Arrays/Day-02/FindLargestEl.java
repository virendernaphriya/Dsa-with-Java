public class FindLargestEl {
    public static void main(String[] args) {
        int[] arr = { 12, 4, 5, 7, 19, 1 };

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Max element is : " + max);

    }
}