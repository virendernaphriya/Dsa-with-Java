import java.util.Scanner;

public class ConditionalStatements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age=sc.nextInt();
        boolean indian=true;

        if(age>18){
            if(indian){
                System.out.println("you are indian youth");
            }else{
                System.out.println("you are adult");
            }
        }else if(age>13){
            System.out.println("you are a teenager");
        }else {
            System.out.println("you are a child");
        }
        
        sc.close();
    }
}