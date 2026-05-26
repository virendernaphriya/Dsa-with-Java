import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a Num : ");
        int num=sc.nextInt();

        int i=0;

        while (num>0) {
            num=num/10;
            i++;
        }

        System.out.println("No. of digits in Number is :"+i);
        sc.close();
    }
}
