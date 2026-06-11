public class CountOccurence {

    static int getOccurence(int[] arr,int n){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={2,3,4,3,3,5,2,0,3};
        System.out.println(getOccurence(arr,9));
    }
}
