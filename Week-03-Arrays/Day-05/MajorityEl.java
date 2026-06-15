import java.util.HashMap;

public class MajorityEl {
    static int getMajorityEl(int arr[]){
        HashMap<Integer,Integer>  map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        int n = arr.length/2;

        for(Integer k : map.keySet()){
            if(map.get(k)>n){
                return k;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={2, 2, 1, 1, 1, 2, 2};
        System.out.println(getMajorityEl(arr));
    }
}
