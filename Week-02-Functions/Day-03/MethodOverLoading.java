public class MethodOverLoading {

    static int mul(int a, int b){
        System.out.println("first called");
        return a*b;
    }

    static int mul(int a, int b, int c){
        System.out.println("second called");
        return a*b*c;
    }

    static double mul(float a, float b, float c){
        System.out.println("third called");
        return a*b*c;
    }

    static double mul(float a, int b){
        System.out.println("fourth called");
        return a*b;
    }
    static int sum(int a, int b){
        System.out.println("first called");
        return a+b;
    }

    static int sum(int a, int b, int c){
        System.out.println("second called");
        return a+b+c;
    }

    static double sum(float a, float b, float c){
        System.out.println("third called");
        return a+b+c;
    }

    static double sum(float a, int b){
        System.out.println("fourth called");
        return a+b;
    }
    public static void main(String[] args) {
        double sum=sum(4.0f, 5.0f,6.0f);
        double mul1=mul(5.1f, 2);
        double mul2=mul(5.0f, 2.0f,3.0f);
        double mul3=mul(5, 2);
        double mul4=mul(5, 2,3);
        System.out.println("Sum is : "+ sum);
        System.out.println("mul1 :" + mul1);
        System.out.println("mul2 :" + mul2);
        System.out.println("mul3 :" + mul3);
        System.out.println("mul4 :" + mul4);
    }
}
