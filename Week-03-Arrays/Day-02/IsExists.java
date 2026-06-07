public class IsExists {
    public static void main(String[] args) {
        int[] arr = {10,30,29,45,34};
        int target=45;


        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println(arr[i] + " exists at idx " + i);
                return;
            }
        }

        System.out.println("Element does not exist in the arr");
    }
}
