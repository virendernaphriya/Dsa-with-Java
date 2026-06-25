public class ReverseArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,3,5,7};
        
        int first =0; 
        int last = arr.length-1;

        while (first<last) {
            int temp=arr[first];
            arr[first] = arr[last];
            arr[last]= temp;
            first++;
            last--;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
