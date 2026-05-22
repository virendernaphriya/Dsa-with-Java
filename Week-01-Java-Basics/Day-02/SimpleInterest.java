import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your Principle Amount :");
        int amt=sc.nextInt();

        System.out.print("Enter the rate of interest :");
        int rate=sc.nextInt();

        System.out.print("Enter the time period :");
        int time=sc.nextInt();

        double SI =(amt*rate*time)/100;
        System.out.println("Simple interest is :"+SI);
        sc.close();
    }
}
