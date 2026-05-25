import java.util.Scanner;

public class FindLargestOftwoNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your first num : ");
        int a=sc.nextInt();

        System.out.print("Enter your second num : ");
        int b=sc.nextInt();


        if(a>b){
            System.out.println("a is greater than b");
        }else if(b>a){
            System.out.println("b is greater than a");
        }else{
            System.out.println("both are equal");
        }

        sc.close();
    }
}
