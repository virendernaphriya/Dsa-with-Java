import java.util.Scanner;

public class AvgOf3Num {
    static double avg(int a, int b , int c){
        double sum = a+b+c;
        return sum/3;
    }
    static double avg(float a, float b , float c){
        double sum = a+b+c;
        return sum/3;
    }
    static double avg(double a, double b , double c){
        double sum = a+b+c;
        return sum/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter first num : ");
        // int num1 = sc.nextInt();
        // float num1 =sc.nextFloat();
        double num1 =sc.nextDouble();

        System.out.print("Enter second num : ");
        // int num2 = sc.nextInt();
        // float num2 =sc.nextFloat();
        double num2 =sc.nextDouble();

        System.out.print("Enter third num : ");
        // int num3 = sc.nextInt();
        //  float num3 =sc.nextFloat();
        double num3 =sc.nextDouble();
        sc.close();

        double avg=avg(num1,num2, num3);
        System.out.println("Avg of the three nums is : "+ avg);
    }
}
