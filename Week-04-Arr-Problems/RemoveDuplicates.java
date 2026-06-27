public class RemoveDuplicates {
    static int removeDuplicate(int[] arr){
        int i=0;
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return ++i;
    }

    public static void main(String[] args) {
        int arr[] ={1,1,2,2,2,3,3,3};
        System.out.println(removeDuplicate(arr));
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
