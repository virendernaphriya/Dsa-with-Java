import java.util.HashMap;

public class FrequencyOfElHashMap {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 4, 3, 2 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer m : map.keySet()) {
            System.out.println(m + " -> " + map.get(m));
        }
    }
}