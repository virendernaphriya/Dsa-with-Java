import java.util.Scanner;
public class CountFactorOfN {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Num : ");
        int num=sc.nextInt();
        int count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println("Count is : "+ count);
        sc.close();
    }

}
