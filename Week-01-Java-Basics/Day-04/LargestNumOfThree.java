import java.util.Scanner;

public class LargestNumOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first num : ");
        int a = sc.nextInt();

        System.out.print("Enter the second num : ");
        int b = sc.nextInt();

        System.out.print("Enter the third num : ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("A is the largest number");
        } else if (b >= a && b >= c) {
            System.out.println("B is largest");
        } else if (a == b && b == c) {
            System.out.println("All are equal");
        } else {
            System.out.println("C is greatest");
        }

        sc.close();
    }
}