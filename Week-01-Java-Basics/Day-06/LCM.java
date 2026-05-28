import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Num : ");
        int num1=sc.nextInt();
        System.out.print("Enter the Second Num : ");
        int num2=sc.nextInt();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        sc.close();

        if(num1 ==0 || num2 == 0){
            System.out.println("LCM is : "+ 0);
            return;
        }


        for(int i=1; i<=num1*num2; i++){
            if(i % num1 == 0 && i % num2 ==0){
                System.out.println("LCM is : "+ i);
                return;
            }
        }
    }
}
