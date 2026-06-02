public class GCDUsingEuclidAlgo {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            if(b==0){
                return a;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(18,12));
    }
}
