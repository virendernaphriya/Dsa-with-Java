public class LCMOfArr {
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
        }
        return a;
    }

    static int getLCM(int a, int b){
        return (a*b)/getGCD(a, b);
    }


    public static void main(String[] args) {
        int[] arr ={12,16,20};
        int lcm=arr[0];
        for(int i=1; i<arr.length; i++){
            lcm= getLCM(lcm, arr[i]);
        }

        System.out.println("LCM is : "+lcm);
    }
}
