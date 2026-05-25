import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a char : ");
        char c=sc.next().charAt(0);

        c = Character.toLowerCase(c);

        if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("Char is vowel");
        }else{
            System.out.println("char is constant");
        }

        sc.close();
    }
}
