import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    static  List<List<Integer>> fourSumBrute(int arr[], int target){
        
        Set<List<Integer>> listSet= new HashSet<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                for(int k=0; k<arr.length; k++){
                    for(int l=0; l<arr.length; l++){
                        if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l &&l!=i){
                            int sum=arr[i]+arr[j]+arr[k]+arr[l];

                            if(sum==target){
                                List<Integer> list=new ArrayList<>();
                                list.add(arr[i]);
                                list.add(arr[j]);
                                list.add(arr[k]);
                                list.add(arr[l]);
                                Collections.sort(list);

                                if(!listSet.contains(list)){
                                    listSet.add(list);
                                }

                            }

                        }
                    }
                }
            }
        }

        List<List<Integer>> ansList=new ArrayList<>(listSet);
        return  ansList;
    }
    public static void main(String[] args) {
        int arr[] ={1,0,-1,0,-2,2};
        System.out.println(fourSumBrute(arr,0));
    }
}
