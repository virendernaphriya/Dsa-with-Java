public class CountPrime {
    static int countPrime(int n){
        int[] arr = new int[n+1];
        for(int i=2; i<arr.length; i++){
            arr[i]=1;
        }
        arr[0]=0;
        arr[1]=0;

        for(int i=2; i*i<=n; i++){
            if(arr[i]==0)
                continue;
            for(int j=i*i; j<=n; j+=i){
                arr[j]=0;
            }
        }

        int count=0;
        for(int i=2; i<=n; i++){
            if(arr[i]==1){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrime(100));
    }
}
