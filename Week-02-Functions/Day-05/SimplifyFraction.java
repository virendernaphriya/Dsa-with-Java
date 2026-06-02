public class SimplifyFraction {
     static int getGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        //fraction is 6/12
        int a=6;
        int b=12;

        int gcd =getGCD(a, b);
        
        a /=gcd;
        b /=gcd;

        System.out.println("Now the simplified fraction is " + a +"/" + b);

    }
}
