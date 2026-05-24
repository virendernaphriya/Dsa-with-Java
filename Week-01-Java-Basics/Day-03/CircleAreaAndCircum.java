import java.util.Scanner;

public class CircleAreaAndCircum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int r=sc.nextInt();

        double area=Math.PI*r*r;
        double circum=2*Math.PI*r;
        System.out.println("Area of the circle is :"+area);
        System.out.println("circumference of circle is:"+circum);
        sc.close();
    }
}
