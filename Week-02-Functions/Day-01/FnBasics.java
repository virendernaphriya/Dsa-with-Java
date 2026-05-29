public class FnBasics {
    static void hello(){
        System.out.println("Hey Coderz");
    }

    static void helloJava(){
        System.out.println("Hello Java");
    }

    static void OneToN(int n){
        for(int i =1; i<=n; i++){
            System.out.println(i);
        }
    }

    static void Square(int n){
        System.out.println(n*n);
    }

    static void Cube(int n){
        System.out.println(n*n*n);
    }

    static void MultiplicationTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+ " x " +i + " = "+ n*i);
        }
    }


    static void printEvenFrom1toN(int n){
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printEvenFrom1toN(15);
    }    
}
