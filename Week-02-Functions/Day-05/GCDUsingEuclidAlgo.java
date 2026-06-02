public class GCDUsingEuclidAlgo {
    static int gcd(int a, int b) {
        a= Math.abs(a);
        b=Math.abs(b);
        if(a==0) return b;
        if (b==0) return a;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(18, 12));
    }
}
