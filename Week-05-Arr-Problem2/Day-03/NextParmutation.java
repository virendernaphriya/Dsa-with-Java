import java.lang.reflect.Array;
import java.util.Arrays;

public class NextParmutation {
    static void getNextParmutation(int arr[]){
        int breakingPoint=arr.length-1;
        // Step 1 : longest prefix
        int count=0;
        for(int i=arr.length-1; i>0; i--){
            if(arr[i-1]<arr[i]){
                count ++;
                breakingPoint=i-1;
                break;
            };
        }

        if(count==0){
            int first=0; int last=arr.length-1;
            while(first<last){
                int temp=arr[first];
                arr[first]=arr[last];
                arr[last]=temp;
                first++;
                last--;
            }
            return;
        }

        System.out.println(breakingPoint +" breaking point");

        //finding the smallest element that is just greater than our arr[breaking point]
        int smallest=Integer.MAX_VALUE;
        int sIdx=0;
        for(int i=breakingPoint+1; i<arr.length; i++ ){
            if(arr[i]<smallest && arr[breakingPoint]<arr[i]){
                smallest=arr[i];
                sIdx=i;
            }
        }

        System.out.println("Smallest value is "+ smallest);
        int temp=arr[breakingPoint];
        arr[breakingPoint]=arr[sIdx];
        arr[sIdx]=temp;

        Arrays.sort(arr,breakingPoint+1,arr.length);
    }

    static void reverseArr(int arr[],int first, int last){
        while (first<last) {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }

    static void getNextParmutationOptimal(int arr[]){
        //finding breaking point
        int n=arr.length;

        int bIdx=-1;
        //this is our breaking index
        int count=0;
        for(int i=n-1; i>0; i--){
            if(arr[i-1]<arr[i]){
                bIdx=i-1;
                count++;
                break;
            }
        }
        System.out.println(bIdx + " bid");

        if(bIdx==-1 || count==0){
            reverseArr(arr,0,n-1);
            return;
        }

        //finding smallest num but greater than the breaking idx num
        int sIdx=-1;
        for(int i=n-1; i>bIdx; i--){
            if(arr[i]>arr[bIdx]){
                sIdx=i;
                break;
            }
        }


        //swapping breaking point num with smallest num
        int temp=arr[bIdx];
        arr[bIdx]=arr[sIdx];
        arr[sIdx]=temp;

        reverseArr(arr, bIdx+1, n-1);

    }

    public static void main(String[] args) {
        int arr[]={2,3,1,3,3};
        getNextParmutationOptimal(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
