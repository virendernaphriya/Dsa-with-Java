public class FrequencyOfEl {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 4, 2, 2 };

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " Exists in the array with freq " + count);
        }
    }
}
