import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    static List<List<Integer>> threeSum(int arr[]) {
        // create an hashmap to store all pairs sum
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ansList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                map.put(arr[i] + arr[j], Arrays.asList(i, j));
                System.out.println("i:" + i + "j:" + j + "arr[i]+arr[j]=" + (arr[i] + arr[j]));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(-arr[i])) {
                List<Integer> RList = map.get(-arr[i]);
                System.out.println("RLIST IS:" + RList);
                int k = RList.get(0);
                int j = RList.get(1);
                List<Integer> tempList = new ArrayList<>();

                if (i != j && j != k && i != k) {
                    tempList.add(arr[i]);
                    tempList.add(arr[j]);
                    tempList.add(arr[k]);
                    ansList.add(tempList);
                }
            }
        }
        return ansList;

    }

    static List<List<Integer>> threeSumBrute(int arr[]) {

        
        List<List<Integer>> ansList = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        Collections.sort(list);
                        if (!set.contains(list)) {
                            ansList.add(list);
                        }
                        set.add(list);
                    }

                }
            }
        }
        return ansList;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSumBrute(arr));
    }
}
