import java.util.HashMap;

public class DistinctEl {
    static int countDistinct(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.size();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 2, 4, 5 };
        System.out.println(countDistinct(arr));
    }
}