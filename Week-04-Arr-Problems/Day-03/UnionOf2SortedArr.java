import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOf2SortedArr {
    static int[] getUnionBrute(int arr1[], int arr2[]) {
        Set<Integer> set = new HashSet<>();

        // iterating first array and put all unique elements in the set
        for (int num : arr1) {
            set.add(num);
        }

        // iterating second arr and put all unique elements in the set
        for (int num : arr2) {
            set.add(num);
        }

        // now copying elements from set into a new arr
        int union[] = new int[set.size()];

        int i = 0;
        for (int num : set) {
            union[i++] = num;
        }

        return union;
    }

    static List<Integer> getUnion(int arr1[], int arr2[]) {
        List<Integer> list = new ArrayList<>();
        int m = arr1.length;
        int n = arr2.length;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                if (!list.contains(arr1[i])) {
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if (!list.contains(arr2[j])) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < m) {
            if (!list.contains(arr1[i])) {
                list.add(arr1[i]);
            }
            i++;
        }

        while (j < n) {
            if (!list.contains(arr2[j])) {
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 3, 5 };
        int arr2[] = { 2, 3, 4, 4, 5, 6 };
        // int ans[] = getUnionBrute(arr1, arr2);
        
        // for (int i = 0; i < ans.length; i++) {
        //     System.out.print(ans[i] + " ");
        // }

        List<Integer> list =getUnion(arr1, arr2);
        for(int num :list){
            System.out.print(num + " ");
        }
    }
}