import java.util.Scanner;

public class EvenFrom1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value on N :");

        int N=sc.nextInt();


        //1st method
        for(int i=1; i<=N; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        //2nd method
        for(int j=2; j<=N; j+=2){
            System.out.print(j+" ");
        }

        sc.close();
    }
}
