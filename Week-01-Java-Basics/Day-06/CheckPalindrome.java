import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Num : ");
        int num=sc.nextInt();

        int newNum=0;
        int oldNum=num;

        while (num>0) {
            int temp=num%10;
            newNum= newNum* 10+temp;
            num/=10;
        }
        
        if(oldNum==newNum){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Num is not Palindrome");
        }

        sc.close();
    }
}