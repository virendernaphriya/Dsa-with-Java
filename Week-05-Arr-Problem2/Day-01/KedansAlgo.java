public class KedansAlgo {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};

        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int start=-1;
        int end=-1;
        for(int i=0; i<arr.length; i++){

            if(sum==0) start=i;
            sum+=arr[i];

            if(sum>maxSum){
                maxSum=sum;
                end=i;
            }
            if(sum<0){
                sum=0;
            }

            
        }

        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+maxSum+">>>>>>>>>>>>>>>>>>>>>>>");
    }
}
