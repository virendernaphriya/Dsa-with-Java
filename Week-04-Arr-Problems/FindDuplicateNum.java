public class FindDuplicateNum {
    static int findDuplicate(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,3,3,3,3};
        System.out.println(findDuplicate(arr));
    }
}
