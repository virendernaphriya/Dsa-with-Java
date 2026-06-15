import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 4, 53, 3, };

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Integer k : map.keySet()){
            if(map.get(k) > 1){
                System.out.println("Duplicate "+ k);
            }
        }
    }
}
