import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();
        char optr=sc.next().charAt(0);
        int num2=sc.nextInt();

        switch (optr) {
            case '+':
                System.out.println("Sum is : "+(num1+num2));
                break;
            case '-':
                System.out.println("Sub is : "+(num1-num2));
                break;
            case '*':
                System.out.println("Mul is : "+num1*num2);
                break;
            case '/':
                System.out.println("Div is : "+num1/num2);
                break;
        
            default:
                break;
        }

        sc.close();
        
    }
}
