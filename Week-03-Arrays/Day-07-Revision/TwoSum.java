public class TwoSum {
    static int[] getTwoSum(int arr[],int target){
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[i]+arr[j]==target){
                    int ans[] = {i,j};
                    return ans;
                }
            }
        }
        int[] ans={};
        return ans;
    }


    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,2};
        int ans[] =getTwoSum(arr,6);

        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
