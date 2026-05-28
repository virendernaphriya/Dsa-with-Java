import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num : ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int newNum = 0;

        for (int i = 0; i <= num; i++) {
            if (i == 0 || i == 1) {
                System.out.println(i);
            } else {
                newNum = a + b;
                a = b;
                b = newNum;
                System.out.println(newNum);
            }
        }
        sc.close();
    }
}
