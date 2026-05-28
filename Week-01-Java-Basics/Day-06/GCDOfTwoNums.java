import java.util.Scanner;

public class GCDOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Num : ");
        int num1=sc.nextInt();
        System.out.print("Enter Second Num : ");
        int num2=sc.nextInt();

        num1=Math.abs(num1);
        num2=Math.abs(num2);
        int minNum=Math.min(num1, num2);
        sc.close();

        if(num1==0){
            System.out.println("GCD is : "+ num2);
        }else if(num2==0){
            System.out.println("GCD is : "+ num1);
        }

        for(int i =minNum; i>1; i--){
            if(num1 % i==0 && num2 % i==0){
                System.out.println("GCD of the two Nums is : "+ i);
                return;
            }
        }

        System.out.println("GCD of two numbers is 1");

    }
}
