public class TwoSum {
    static int[] getTwoSumIdx(int[] arr,int target){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    int[] ans={i,j};
                    return ans;
                }
            }
        }
        int ans[]={};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,3,5};
        int target=6;
        int[] ans=getTwoSumIdx(arr, target);

        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
