public class CheckCoprime {
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
        int num1 =8;
        int num2 =15;

        int gcd=getGCD(num1, num2);
        if(gcd == 1){
            System.out.println("The nums are coprime");
        }else{
            System.out.println("The nums are not coprime");
        }
    }

}
