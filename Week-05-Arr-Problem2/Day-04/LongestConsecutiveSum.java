public class LongestConsecutiveSum {
    static int getLongestConsecutive(int arr[]) {
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count=1;

            while(lSearch(arr,num+1)){
                num++;
                count++;
                longest=Math.max(longest, count);
            }
        }

        return longest;
    }

    static boolean lSearch(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {100,4,200,1,3,2};
        System.out.println(getLongestConsecutive(arr));
    }
}
