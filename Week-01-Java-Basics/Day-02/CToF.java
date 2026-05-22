import java.util.Scanner;

public class CToF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the temp in Celcius:");
        int C=sc.nextInt();

        double F=C*9/5+32;
        System.out.println("Temp in F is :"+F);
        sc.close();
    }
}
