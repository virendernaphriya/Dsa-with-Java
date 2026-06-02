
public class LCMUsingGCD {
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

            if (b == 0) {
                return a;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int gcd = getGCD(a, b);
        System.out.println("Gcd id : " + gcd);

        int lcm = (a * b) / gcd;
        System.out.println("LCM is : " + lcm);
    }
}
