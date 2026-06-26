import java.util.HashMap;

public class FrequencyOfArr {

    public static void main(String[] args) {
        int arr[] ={2,3,4,5,3,5,3};
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int num :arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println(map);
    }
}