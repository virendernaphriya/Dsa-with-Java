import java.util.Scanner;

public class CheckPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num : ");
        int n = sc.nextInt();
        sc.close();

        if(n==1){
            System.out.println("Neither prime nor composite ");
            return;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Num is not prime");
                return;
            }

        }
        System.out.println("Num is Prime");

    }
}
