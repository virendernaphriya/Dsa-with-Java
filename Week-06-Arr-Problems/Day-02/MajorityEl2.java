import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityEl2 {
    static List<Integer> majorityEl(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) == n / 3 + 1) {
                list.add(arr[i]);

            }
            if(list.size()==2){
                break;
            }
        }

        // for(int k:map.keySet()){
        // if(map.get(k)>n/3){
        // list.add(k);
        // }
        // }

        return list;

    }


    static List<Integer> majorityElOptimal(int arr[]){
        List<Integer> list= new ArrayList<>();
        int n=arr.length;

        int el1=0;
        int count1=0;
        int el2=0;
        int count2=0;

        for(int i=0; i<n; i++){
             if(count1==0 && arr[i]!=el2){
                count1=1;
                el1=arr[i];
            }else if(count2==0 && arr[i]!=el1){
               count2=1;
               el2=arr[i]; 
            }else if(arr[i]==el1){
                count1++;
            }else if(arr[i]==el2){
                count2++;
            }else{
                count1--;
                count2--;
            }

           
        }

        int tCount1=0;
        int tCount2=0;
        for(int i=0; i<n; i++){
            if(arr[i]==el1){
                tCount1++;
            }else if(arr[i]==el2){
                tCount2++;
            }
        }

        if(tCount1>n/3){

            list.add(el1);
        }
        if(tCount2>n/3){
            list.add(el2);
        }
        return list;

    }
    public static void main(String[] args) {
        int arr[] = {2,1,1,3,1,4,5,6};
        System.out.println(majorityElOptimal(arr));
    }
}
