public class SecondSmallest {

    //Time complexity is O(n+n)=>O(n) , this is brute force , we need to traverse the arr two times
    static int get2ndSmallest(int[] arr){
        int min=arr[0];
        int idx=0;

        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                idx = i;
            }
        }

        int SecMin=arr[0];
        for(int i=0; i<arr.length; i++){
            if(i==idx) continue;
            if(arr[i]< SecMin){
                SecMin = arr[i];
            }
        }

        return SecMin;
    }

    static int get2ndMin(int[] arr){
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;


        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                secMin = min;
                min = arr[i];
            }else if(min<arr[i] && secMin > arr[i]){
                secMin=arr[i];
            }
        }

        System.out.println("Min : "+ min);
        System.out.println("secMIN : "+ secMin);
        return secMin;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3};
        System.out.println(get2ndMin(arr));
        // System.out.println(get2ndSmallest(arr));

    }


}
