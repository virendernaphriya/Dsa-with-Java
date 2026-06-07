public class AvgOfArr {
    public static void main(String[] args) {
        double sum=0.0;
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        double avg=sum/arr.length;
        System.out.println("Average is : "+ avg);
    }
}
