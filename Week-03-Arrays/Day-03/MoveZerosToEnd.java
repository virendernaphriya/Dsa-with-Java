public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,4,0,0,5,3,0};

        int last = arr.length-1;

        int i=0;
        while (i<last) {    
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[last];
                arr[last]=temp;
                last--;
            }else{
                i++;
            }
        }
        

        for(int j=0 ; j<arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
