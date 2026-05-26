import java.util.Scanner;

public class printNto1 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N=sc.nextInt();

        for(int i=N; i>=1; i--){
            System.out.println(i);
        }

        sc.close();
    }
}
