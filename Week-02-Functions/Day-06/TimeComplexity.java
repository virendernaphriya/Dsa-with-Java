public class TimeComplexity {
    public static void main(String[] args) {

        //time complexity is O(n)
        int n=5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        //tc O(n^2)
        for(int j=1; j<=n ; j++){
            for(int k=1; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //tc O(n log n)
        for(int j=1; j<=n ; j++){
            for(int k=1; k<=n; k*=2){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
