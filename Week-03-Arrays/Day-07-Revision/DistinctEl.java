import java.util.HashMap;

public class DistinctEl {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,3,2,5};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Integer k :map.keySet()){
            if(map.get(k)==1){
                System.out.println(k);
            }
        }
    }
}
