import java.util.HashMap;

public class SubArrayCountWithSumK {
    static int subArrayCountBrute(int arr[], int Ksum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == Ksum) {
                    count++;
                }
            }
        }

        return count;
    }

    static int subArrayCountOptimal(int arr[],int k){
        int preSum=0;
        int count=0;

        //intution is simple , firly we put 0, 1 in our map ,and then we will calculate prefix sum , and if prefix sum-k already exist , then we get the count how many times it exist and then add it to the count and put new prefix sum and count in the map

        HashMap<Integer,Integer> map= new HashMap<>();

        map.put(0, 1);

        for(int i=0; i<arr.length; i++){
            preSum+=arr[i];
            if(map.containsKey(preSum-k)){
                int val=map.get(preSum-k);
                count=count+val;
            }
            map.put(preSum, map.getOrDefault(preSum, 0)+1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {3,-3, 1, 1, 1 };
        System.out.println(subArrayCountOptimal(arr, 3));
    }
}
