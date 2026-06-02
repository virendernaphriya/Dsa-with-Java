public class GCDUsingLoops {
    static int getGCD(int num1 , int num2){
        if(num1 == 0){
            return num2;
        }else if(num2 == 0){
            return num1;
        }

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        int min = Math.min(num1, num2);

        for(int i=min; i>=1; i--){
            if(num1 % i==0 && num2 %i==0){
                return i;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        System.out.println(getGCD(10,25));
    }
}
