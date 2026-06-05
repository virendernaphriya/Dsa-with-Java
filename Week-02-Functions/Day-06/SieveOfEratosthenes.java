public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            arr[i] = 1;
        }

        for (int i = 2; i * i <= n; i++) {
            if (arr[i] == 0)
                continue;
            for (int j = i*i; j <= n; j+=i) {
                arr[j] = 0;
            }
        }

        System.out.println("Prime numbers");
        int count =0;
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 1) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Count is : "+count);
    }
}
