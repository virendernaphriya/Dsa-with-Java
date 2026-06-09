public class IsArrPalindrome {
    static boolean checkPalindrome(int[] arr){
        int left=0;
        int right=arr.length-1;

        while (left<right) {
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;
    
    }
    public static void main(String[] args) {
        int[] arr={2,5,6,6,5,2};

        if(checkPalindrome(arr)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
