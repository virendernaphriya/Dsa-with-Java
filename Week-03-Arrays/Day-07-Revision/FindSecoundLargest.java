public class FindSecoundLargest {
    static int secondLargest(int[] arr){
        int max =Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secondLargest =max;
                max = arr[i];
            }else if (arr[i] > secondLargest && arr[i] <max){
                secondLargest=arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,33,54};
        System.out.println(secondLargest(arr));
    }
}
