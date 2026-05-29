public class TypesOfFn {
    // Fn without parameters and without return type
    static void hello() {
        System.out.println("hello");
    }

    //methods with parameter but no return type
    static void greet(String name){
        System.out.println("Hello "+ name);
    }


    //method with parameter and with return type
    static int sum(int a, int b){
        return a+b;
    } 

    public static void main(String[] args) {
        hello();
        greet("Virender");
        int s=sum(4,23);
        System.out.println("Sum is : "+ s);
    }
}