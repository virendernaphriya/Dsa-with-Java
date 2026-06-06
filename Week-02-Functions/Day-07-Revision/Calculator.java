import java.util.Scanner;

public class Calculator {
    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }

    static int mul(int a , int b){
        return a*b;
    }
    
    static int div(int a,int b){
        if(b==0){
            System.out.println("B cannot be zero");
            return 0;
        }
        return a/b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        char optr =sc.next().charAt(0);
        int b=sc.nextInt();
        sc.close();

        switch (optr) {
            case '+':
                System.out.println(sum(a, b));
                break;
            case '-':
                System.out.println(sub(a, b));
                break;
            case '*':
                System.out.println(mul(a, b));
                break;
            case '/':
                System.out.println(div(a, b));
                break;
        
            default:
                System.out.println("Enter a valid operator");
                break;
        }
    }
}
