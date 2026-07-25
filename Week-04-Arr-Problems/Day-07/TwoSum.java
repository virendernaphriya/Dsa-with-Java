import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    static int[] getTwoSumIdxBrute(int arr[], int k){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==k){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int[] getTwoSumIdxBetter(int arr[],int k){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int val=Math.abs(arr[i]-k);
            if(map.containsKey(val)){
                int idx=map.get(val);
                int ans[] = {i,idx};
                return ans;
            }
            map.put(arr[i], i);
        }

        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int arr[] ={2,7,11,15};
        int ans[]=getTwoSumIdxBetter(arr, 9);
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}