public class PrimeCountFrom1ToN {

    static boolean CheckPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int CountPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (CheckPrime(i)) {
                System.out.println(i);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int num = CountPrime(100);
        System.out.println(num);
    }
}
