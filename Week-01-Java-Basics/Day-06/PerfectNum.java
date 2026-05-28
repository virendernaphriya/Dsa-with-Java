import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num :");
        int num=sc.nextInt();
        int sum=0;

        for(int i=1; i<num; i++){
            if(num%i==0){
                sum+=i;
            }
        }

        if(sum==num){
            System.out.println("This is a Perfect num ");
        }else{
            System.out.println("Num is not a perfect num");
        }

        sc.close();
    }
}
