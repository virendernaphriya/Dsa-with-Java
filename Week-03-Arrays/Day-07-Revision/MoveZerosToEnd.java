public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int first=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0){
                int temp=arr[i];
                arr[i]=arr[first];
                arr[first]=temp;
                first++;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
