import java.util.Arrays;
import java.util.HashSet;

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

    static int getLongestConsecutiveBetter(int arr[]){
       if(arr.length==0){
            return 0;
        }
        int longest=1;
        Arrays.sort(arr);
        int count=1;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]+1==arr[i+1]){
                count++;
                longest=Math.max(count, longest);
            }else if(arr[i]==arr[i+1]){
                continue;
            }else{
                count=1;
            }
        }

        return longest;
    }


    static int getLongestConsecutiveOptimal(int arr[]){
        int longest=1;
        if(arr.length==0){
            return 0;
        }

        HashSet<Integer> set= new HashSet<>();

        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                int x=num;
                while (set.contains(x+1)) {
                    count++;
                    x++;
                }
                longest=Math.max(longest,count);
            }
        }

        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {100,4,200,1,3,2};
        System.out.println(getLongestConsecutiveOptimal(arr));
    }
}
