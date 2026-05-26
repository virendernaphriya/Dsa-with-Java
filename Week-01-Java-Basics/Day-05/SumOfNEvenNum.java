import java.util.Scanner;

public class SumOfNEvenNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int N=sc.nextInt();

        int sum=0;

        for(int i=1; i<=N; i++){
            if(i%2==0){
                sum +=i;
            }
        }

        System.out.print("Sum of first "+N+" Natural Even Nums is : "+sum);
        sc.close();
    }
}