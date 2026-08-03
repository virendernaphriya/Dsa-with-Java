import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArr {
    static List<Integer> getLeaders(int arr[]){
        List<Integer> list = new ArrayList<>();

        int last=arr[arr.length-1];
        list.add(last);
        for(int i=arr.length-1; i>0; i--){
            if(arr[i]>last){
                list.add(arr[i]);
                last=arr[i];
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};
        List<Integer> list =getLeaders(arr);
        for(int num :list){
            System.out.println(num);
        }
    }
}
