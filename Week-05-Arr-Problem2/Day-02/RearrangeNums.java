import java.util.ArrayList;

public class RearrangeNums {

    static void RearrangeNumsBrute(int arr[]){
        ArrayList<Integer> positiveList = new ArrayList<>();
        ArrayList<Integer> NegativeList = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                positiveList.add(arr[i]);
            }
            else{
                NegativeList.add(arr[i]);
            }
        }

        int positiveIdx=0;
        int negativeIdx=1;
        for(int l :positiveList){
            arr[positiveIdx]=l;
            positiveIdx+=2;
        }
        for(int l :NegativeList){
            arr[negativeIdx]=l;
            negativeIdx+=2;
        }
    }

    static int[] reArrageNumsOptimal(int arr[]){
        int temp[] = new int[arr.length];

        int positiveIdx=0;
        int negativeIdx=1;
        for(int i=0; i<arr.length; i++){
           if(arr[i]>0){
                temp[positiveIdx]=arr[i];
                positiveIdx+=2;
           }else if(arr[i]<0){
                temp[negativeIdx]=arr[i];
                negativeIdx+=2;
           }
        }

        return temp;
    }

    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        // RearrangeNumsBrute(arr);
        int ans[]=reArrageNumsOptimal(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}