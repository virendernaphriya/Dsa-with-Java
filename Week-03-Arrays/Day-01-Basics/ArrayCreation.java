public class ArrayCreation{
    public static void main(String[] args) {
        //declare + allocate default value 0 false null acc to type
        // int[] num =new int[5];
        // int num2[] =new int[5];


        //declare + initialize 
        int[] arr = {12,24,23,20,30};
        arr[0]=13;
        // System.out.println(arr[0]);
        for(int i=0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}