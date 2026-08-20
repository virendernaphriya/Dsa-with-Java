import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityEl2 {
    static List<Integer> majorityEl(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        for(int k:map.keySet()){
            if(map.get(k)>n/3){
                list.add(k);
            }
        }

        return list;
        
    }

    public static void main(String[] args) {
        int arr[]={1,2};
        System.out.println(majorityEl(arr));
    }
}
