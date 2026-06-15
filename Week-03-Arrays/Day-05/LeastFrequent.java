import java.util.HashMap;

public class LeastFrequent {
    static int getLeastFreqEl(int[] arr){
      HashMap<Integer,Integer> map = new HashMap<>();

      for(int num :arr){
        map.put(num, map.getOrDefault(num, 0)+1);
      }

      int MIN= Integer.MAX_VALUE;
      int k=arr[0];

      for(Integer key : map.keySet()){
        if(map.get(key) < MIN){
            MIN = map.get(key);
            k=key;
        }
      }
      return k;
    }

    public static void main(String[] args) {
        int[] arr ={2,4,3,5,3,5,6,3};
        System.out.println(getLeastFreqEl(arr));
    }

}
