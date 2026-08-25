import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
                    System.out.println("i:"+i+"j:"+j+"arr[i]+arr[j]="+(arr[i]+arr[j]));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(-arr[i])) {
                List<Integer> RList = map.get(-arr[i]);
                System.out.println("RLIST IS:" + RList);
                int k = RList.get(0);
                int j = RList.get(1);
                List<Integer> tempList=new ArrayList<>();

                if (i != j && j != k && i!=k) {
                    tempList.add(arr[i]);
                    tempList.add(arr[j]);
                    tempList.add(arr[k]);
                    ansList.add(tempList);
                }
            }
        }
        return ansList;

    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(arr));
    }
}
