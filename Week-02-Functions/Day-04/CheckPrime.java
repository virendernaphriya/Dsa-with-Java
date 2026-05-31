public class CheckPrime {

    static void isPrime(int n){
        if(n==1){
            System.out.println("Not Prime");
            return;
        }
        for(int i=2; i*i<=n; i++){
            if(n % i == 0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }

    public static void main(String[] args) {
        isPrime(1);
    }
}