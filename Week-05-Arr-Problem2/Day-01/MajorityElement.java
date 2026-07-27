import java.util.HashMap;

public class MajorityElement {
    static int getMajorityElBrute(int arr[]){
        int n=arr.length;
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(++count > n/2){
                return arr[i];
            }
            
        }
        return -1;

        //time complexity of it is O(n^2)
    }

    static int getMajorityElBetter(int arr[]){
        int n= arr.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int key: map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }

        return -1;

        //now the time complexity is O(n) but we are using extra space 
    }

    public static void main(String[] args) {
        int arr[]= {3,2,3};
        System.out.println(getMajorityElBetter(arr));
    }
}
