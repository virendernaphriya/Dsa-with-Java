import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age :");
        int age=sc.nextInt();

        System.out.print("Enter your name:");
        String name=sc.next();
        
        System.out.println("Your name is "+name+" and you are "+age+" old");
        sc.close();
    }
}
