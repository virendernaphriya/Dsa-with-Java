import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Num : ");
        int num = sc.nextInt();

        int originalNum=num;
        int count=0;

        if(num==0){
            System.out.println("NO. is and armstrong Num");
        }

        while (num>0) {
            num/=10;
            count++;
        }

        double sum=0.0;
        int tempNum=originalNum;
        while (originalNum>0) {
            int temp2=originalNum%10;
            sum+=Math.pow(temp2, count);

            originalNum/=10;
        }

        if(sum==tempNum || tempNum ==0){
            System.out.println("No. is an armstrong Num ");
        }else{
            System.out.println("Num is not an armstrong num ");
        }

        sc.close();
    }
}
