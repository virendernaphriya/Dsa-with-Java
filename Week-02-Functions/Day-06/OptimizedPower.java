import java.util.Scanner;

public class OptimizedPower{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the pow : ");
        int pow=sc.nextInt();
        System.out.print("Enter the base : ");
        int base=sc.nextInt();

        int ans=1;

        //simple logic if pow is odd multiply ans with the current base
        //then , square the base and half the power
        while (pow !=0) {
            if(pow % 2 !=0){
                ans *= base;
            }
            pow /= 2;
            base *=base;
        }

        //tc O(log pow)

        System.out.println("Ans is : "+ ans);
        sc.close();

    }
}