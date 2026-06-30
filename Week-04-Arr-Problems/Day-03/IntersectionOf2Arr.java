import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOf2Arr {
    static List<Integer> getInterSection(int arr1[] , int arr2[]){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            if(set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }

        return list;

    }

    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,1,3};
        int arr2[] = {2,3,6,1};

        List<Integer> list = getInterSection(arr1, arr2);

        for(int num : list){
            System.out.print(num + " ");
        }
    }
}
