import java.util.HashMap;

public class MostFrequentEl {
    static int getMostFreqEl(int[] arr){
      HashMap<Integer,Integer> map = new HashMap<>();

      for(int num :arr){
        map.put(num, map.getOrDefault(num, 0)+1);
      }

      int Max = Integer.MIN_VALUE;
      int k=arr[0];

      for(Integer key : map.keySet()){
        if(map.get(key) > Max){
            Max = map.get(key);
            k=key;
        }
      }
      return k;
    }

    public static void main(String[] args) {
        int[] arr ={2,4,3,5,3,5,6,3};
        System.out.println(getMostFreqEl(arr));
    }
}
