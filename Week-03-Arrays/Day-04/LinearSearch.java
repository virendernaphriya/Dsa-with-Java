
public class LinearSearch {
    public static void main(String[] args) {
        int target = 7;
        int arr[]= {2,4,3,6,7,9,1};

        for(int i=0 ; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println(target + " is present at idx "+ i);
                return;
            }
        }
        System.out.println("Element does not exist in the arr");
    }
}
