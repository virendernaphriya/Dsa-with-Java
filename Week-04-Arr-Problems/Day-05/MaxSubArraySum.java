public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int maxSum=Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                    if(sum>maxSum){
                        maxSum=sum;
                    }

                    if(sum<minSum){
                        minSum=sum;
                    }
                }
            }
        }

        System.out.println("Max subarray sum is:"+maxSum);
        System.out.println("Max subarray sum is:"+minSum);
    }
}
