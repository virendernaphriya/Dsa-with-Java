import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int r=sc.nextInt();
        double area=Math.PI*r*r;
        System.out.println("Area is: "+ area);
        sc.close();
    }
}
