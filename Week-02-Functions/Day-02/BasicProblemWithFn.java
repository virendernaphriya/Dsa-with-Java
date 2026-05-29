public class BasicProblemWithFn {
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }

    static int max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    static int min(int a,int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }

    static void checkEvenOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }


    static double areaOfCircle(int r){
        return Math.PI*r*r;
    }

    static int fact(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact *= i;        
        }
        return fact;
    }

    static int Square(int n){
        return n*n;
    }

    public static void main(String[] args) {
        int sum=add(3,4);
        System.out.println("Sum is : "+sum);
        int mul=mul(3,4);
        System.out.println("Mul is : "+ mul);
        int div=div(3,4);
        System.out.println("Div is : "+ div);
        int sub=sub(3,4);
        System.out.println("Sub is : "+ sub);

        int min= min(4,6);
        System.out.println("Min Value is : "+ min);
        int max= max(4,6);
        System.out.println("Max Value is : "+ max);

        checkEvenOdd(5);

        double area= areaOfCircle(7);
        System.out.println("Area of the circle is : "+ area);

        int fact=fact(5);
        System.out.println("Factorial is : "+ fact);

        int sqr=Square(12);

        System.out.println("Sqr of the num is : " + sqr);
    }
}
