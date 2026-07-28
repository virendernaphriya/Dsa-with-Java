public class BuyAndSellStock {
    static int BuyAndSellBrute(int arr[]){
        int maxProfit=Integer.MIN_VALUE;
        int profit;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                profit =arr[j]-arr[i];

                maxProfit= Math.max(maxProfit, profit);
                
            }
        }

        return maxProfit;
    }

    static int BuyAndSellOptimal(int arr[]){
        // int maxProfit=0;
        // int min=arr[0];
        // for(int i=0; i<arr.length; i++){
        //     int profit=arr[i]-min;
        //     maxProfit=Math.max(maxProfit, profit);
        //     min=Math.min(min, arr[i]);
        // }
        // return maxProfit;
        int maxProfit=0;
        int max=arr[arr.length-1];
        for(int i=arr.length-1; i>=0; i--){
            int profit=max-arr[i];
            maxProfit=Math.max(maxProfit, profit);
            max=Math.max(max, arr[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] ={7,6,4,3,3,1};
        System.out.println(BuyAndSellOptimal(arr));
    }
}
