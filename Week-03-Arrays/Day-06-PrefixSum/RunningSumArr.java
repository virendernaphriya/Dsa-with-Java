public class RunningSumArr {
    static int[] runningSum(int arr[]){
        for(int i=1; i<arr.length; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int[] runningSum =runningSum(arr);
        for(int i=0; i<runningSum.length; i++){
            System.out.println(runningSum[i]);
        }
    }
}
