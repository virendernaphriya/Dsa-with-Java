public class PerfectNum {
    static int sumOfFactors(int n){
        int sum =0 ;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=12;
        int s=sumOfFactors(n);
        if(n ==s){
            System.out.println("The num is a perfect number");
        }else{
            System.out.println("Not Perfect");
        }
    }
}
