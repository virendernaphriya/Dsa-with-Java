public class RangeSumQuery {
    static int rangeSum(int[] arr , int left, int right){
        int sum=0;
        for(int i=left; i<=right; i++ ){
            sum+=arr[i];
        }
        return  sum;
    }
    public static void main(String[] args) {
        int arr[] = {3, 0, -2, 6, -1};
        System.out.println(rangeSum(arr, 1, 3));
    }
}
