import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first num:");
        int a=sc.nextInt();

        System.out.print("Enter the second num:");
        int b=sc.nextInt();

        int sum=a+b;
        int diff=a-b;
        int product=a*b;
        int div=a/b;

        System.out.println("Sum of the two nums is :"+sum);
        System.out.println("Diff of the two nums is :"+diff);
        System.out.println("Product of the two nums is :"+product);
        System.out.println("division of the two nums is :"+div);
        sc.close();
    }
}
