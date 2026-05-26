import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a num : ");
        int num=sc.nextInt();

        int temp;

        int newNum=0;

        while(num>0){
            temp=num%10;
            newNum=newNum*10+temp;
            num/=10;
        }

        System.out.println("new num is :"+newNum);

        sc.close();
    }
}
