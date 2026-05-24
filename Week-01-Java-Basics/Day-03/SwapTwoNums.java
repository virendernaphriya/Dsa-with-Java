public class SwapTwoNums {
    public static void main(String[] args) {
        //using a third variable
        int a=5;
        int b=7;

        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("Value of a is:"+a);
        System.out.println("Value of b is:"+b);

        //without using the third variable
        int d=3;
        int e=5;

        d=d+e;
        e=d-e;
        d=d-e;
        
        System.out.println("Value of e is;"+e);
        System.out.println("Value of d is:"+d);
    }
}
