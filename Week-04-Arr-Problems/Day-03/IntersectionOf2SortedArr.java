import java.util.ArrayList;
import java.util.List;

public class IntersectionOf2SortedArr {

    static List<Integer> getInterSectionBrute(int arr1[],int arr2[]){
        List<Integer> list = new ArrayList<>();
        int n=arr1.length;
        int m=arr2.length;
        int visited[] = new int[m];
        

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr1[i]==arr2[j] && visited[j]==0){
                    list.add(arr1[i]);
                    visited[j]=arr1[i];
                    break;
                }

                if(arr1[i] < arr2[j]){
                    break;
                }
            }
        }

        return list;
    }

    static List<Integer> getInterSection(int arr1[] , int arr2[]){
        List<Integer>  list = new ArrayList<>();

        int n= arr1.length;
        int m= arr2.length;

        int i =0; 
        int j=0 ;

        while (i<n && j<m) {
            if(arr1[i]==arr2[j]){
                //increment i and j both
                list.add(arr1[i]);
                i++;
                j++;
            }else if (arr1[i]<arr2[j]){
                //increment i
                i++;
            }else if (arr1[i] > arr2[j]){
                //increment j by 1
                j++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,3,4,5,6};
        int arr2[]={3,3,4,5};

        List<Integer> list = getInterSection(arr1, arr2);

        for(int num : list){
            System.out.print(num + " ");
        }
    }
}