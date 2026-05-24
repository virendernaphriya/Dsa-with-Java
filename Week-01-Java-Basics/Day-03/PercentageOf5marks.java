import java.util.Scanner;

public class PercentageOf5marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the marks of math:");
        int m1=sc.nextInt();
        System.out.print("Enter the marks of physics:");
        int m2=sc.nextInt();
        System.out.print("Enter the marks of eng:");
        int m3=sc.nextInt();
        System.out.print("Enter the marks of sci:");
        int m4=sc.nextInt();
        System.out.print("Enter the marks of hindi:");
        int m5=sc.nextInt();
        double obtainedMarks=m1+m2+m3+m4+m5;
        int totalMarks=500;

        double p=(obtainedMarks/totalMarks)*100;
        System.out.println("marks in percentage is:"+p);
        sc.close();
    }
}
