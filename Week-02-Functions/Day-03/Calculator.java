import java.util.Scanner;

public class Calculator {
    static int sum(int a, int b){
        return a+b;
    }
    static int mul(int a ,int b){
        return a*b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int div(int a ,int b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        char c= sc.next().charAt(0);
        int b=sc.nextInt();
        sc.close();

        int result;

        switch (c) {
            case '+':
                result =sum(a, b);
                System.out.println(result);
                break;
            case '-':
                result =sub(a, b);
                System.out.println(result);
                break;
            case '*':
                result =mul(a, b);
                System.out.println(result);
                break;
            case '/':
                result =div(a, b);
                System.out.println(result);
        
            default:
                break;
        }
    }
}
