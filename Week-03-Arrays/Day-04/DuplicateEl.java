
public class DuplicateEl {

    static int checkFrequencyCount(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 3 ,4 };

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyChecked=false;
            for(int k=0; k<i; k++){
                if(arr[k]==arr[i]){
                    alreadyChecked=true;
                    break;
                }
            }
            if(alreadyChecked){
                continue;
            }
            if (checkFrequencyCount(arr, arr[i]) > 1) {
                System.out.println(arr[i]);
            }
        }

    }
}
