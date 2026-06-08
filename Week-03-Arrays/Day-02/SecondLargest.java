public class SecondLargest {
    static int get2ndMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secMAX=Integer.MIN_VALUE;


        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                secMAX=max;
                max = arr[i];
            }else if(max>arr[i] && secMAX < arr[i]){
                secMAX=arr[i];
            }
        }

        System.out.println("Max : "+ max);
        System.out.println("sec Max: "+ secMAX);
        return secMAX;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,4};
        System.out.println(get2ndMax(arr));
    }
}
