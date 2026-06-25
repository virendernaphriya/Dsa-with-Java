public class MissingNum {
    static int missingNumber(int[] nums) {
        int n = nums.length;

        int originalSum=0;
        int sumWithoutNum=0;
        for(int num :nums){
            sumWithoutNum += num;
        }

        for(int i=0; i<=n; i++){
            originalSum += i;
        }

        return originalSum-sumWithoutNum;
    }

    public static void main(String[] args) {
        int arr[] = {0,3,1};
        System.out.println(missingNumber(arr));
    }
}
