public class FindLargestEl{
    static int getLargestNum(int[] arr){

        int MAX = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>MAX){
                MAX = arr[i];
            }
        }

        return MAX;
    }
    public static void main(String[] args) {
        int[] arr ={3,4,5,3,55,43,6};
        System.out.println(getLargestNum(arr));
    }
}