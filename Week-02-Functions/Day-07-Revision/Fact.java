public class Fact {
    static int calFact(int n){
        if(n==0 || n==1){
            return 1;
        }

        int fact=1;
        for(int i=1; i<=n; i++){
            fact *=i;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(calFact(5));
    }
}
