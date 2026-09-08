import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    static List<List<Integer>> threeSumBetter(int arr[]) {
        List<List<Integer>> ansList = new ArrayList<>();
        Set<List<Integer>> listSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int third = -(arr[i] + arr[j]);
                if (set.contains(third)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(third);
                    Collections.sort(list);

                    listSet.add(list);
                }
                set.add(arr[j]);
            }
        }

        ansList.addAll(listSet);
        return ansList;
    }

    static List<List<Integer>> threeSumOptimal(int arr[]) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ansList = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list);
        for (int i = 0; i < arr.length; i++) {
            if(i>0 && list.get(i).equals(list.get(i-1))) continue;
            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int first = list.get(i);
                int second = list.get(j);
                int third = list.get(k);
                int sum = first + second + third;
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(first);
                    tempList.add(second);
                    tempList.add(third);
                    ansList.add(tempList);
                    j++;
                    k--;
                    while (j < k && list.get(j).equals(list.get(k+1))) {
                        j++;
                    }
                    while (j < k && list.get(k).equals(list.get(k+1))) {
                        k--;
                    }
                }
            }
        }
        return ansList;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSumOptimal(arr));
        System.out.println("Done");
    }
}
