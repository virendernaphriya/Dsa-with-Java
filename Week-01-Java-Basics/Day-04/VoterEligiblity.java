import java.util.Scanner;

public class VoterEligiblity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age=sc.nextInt();

        System.out.print("Do you have voter Id : ");
        boolean voterId=sc.nextBoolean();

        if(age >= 18 && voterId){
            System.out.println("You can Vote");
        }else{
            System.out.println("You can not Vote");
        }

        sc.close();

    }
}
