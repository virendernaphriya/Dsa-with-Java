public class FindSmallestEl {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 3, 13, 34 };
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min element is : " + min);
    }
}
