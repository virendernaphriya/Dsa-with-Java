
public class DuplicateEl {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 3};
        int[] dup = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                dup[i] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(dup[i]);
        }

    }
}
