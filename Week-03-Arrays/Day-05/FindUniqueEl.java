import java.util.HashMap;

public class FindUniqueEl {
    public static void main(String[] args) {
        int arr[] = {3,5,4,7,6,5};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num :arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Integer k : map.keySet()){
            if(map.get(k)==1){
                System.out.println("Unique num " + k);
            }
        }
    }
}
