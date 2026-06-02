public class GCDOfArr{
    static int getGCD(int a, int b) {
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
        int[] arr={12,16,20,24};
        int gcd=arr[0];
        for(int i=1; i<arr.length; i++){
            gcd=getGCD(gcd, arr[i]);
        }

        System.out.println("GCD is : "+gcd);
    }
}