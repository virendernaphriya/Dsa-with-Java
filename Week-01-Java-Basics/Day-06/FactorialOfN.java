import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num : ");
        int n=sc.nextInt();

        int fact=n;

        for(int i=n; i > 1; i--){
            fact = fact * (i-1);
        }

        System.out.println("Factorial of n is :" +fact);
        sc.close();
    }
}
