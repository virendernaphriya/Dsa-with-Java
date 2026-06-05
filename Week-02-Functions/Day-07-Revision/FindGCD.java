public class FindGCD {

    static int getGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0)
            return b;
        if (b == 0)
            return a;

    // gcd(a,b)=gcd(b,a mod b)
    //  gcd(18,12)
    //  gcd(12,6)
    //  gcd(6,0)
    //  6


        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(getGCD(12, 18));
    }
}
