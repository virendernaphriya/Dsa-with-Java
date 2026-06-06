public class FindLCM {

    static int getCGD(int a , int b){
        a=Math.abs(a);
        b=Math.abs(b);

        if(a==0) return b;
        if(b==0) return a;

        while (b != 0) {
            int temp = b;
            b= a%b;
            a=temp;
        }

        return a;
    }

    public static void main(String[] args) {
        int a=12;
        int b=6;
        int lcm=a*b/getCGD(a, b);
        System.out.println("LCM is : "+lcm);
    }
}