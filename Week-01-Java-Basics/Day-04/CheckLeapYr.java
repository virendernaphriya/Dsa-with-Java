import java.util.Scanner;

public class CheckLeapYr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Leap Year : ");
        int year=sc.nextInt();


        // Rules for a year to be a leap year
        // 1. not every year divisible by 4 is a leap year
        // 2. year divisible by 100 is not a leap year 
        // 3. exception of 2 if a year is divisible by 400 then it is a leap year
        if(year%4==0 && (year%100!=0 || year%400==0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("This is not a leap year");
        }

        sc.close();
    }
}