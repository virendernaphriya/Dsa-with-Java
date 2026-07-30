import java.util.ArrayList;

public class ReArrangeNumV2 {
    static int[] reArrangeNumV2(int arr[]){
        ArrayList<Integer> negList=new ArrayList<>();
        ArrayList<Integer> posList= new ArrayList<>();

        //seperating negative and positive
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                posList.add(arr[i]);
            }else{
                negList.add(arr[i]);
            }
        }

        if(posList.size()>negList.size()){
            for(int i=0; i<negList.size(); i++){
                arr[i*2]=posList.get(i);
                arr[i*2+1]=negList.get(i);
            }

            int idx=negList.size()*2;
            for(int i=negList.size(); i<posList.size(); i++){
                arr[idx]=posList.get(i);
                idx++;
            }
        }else{
            for(int i=0; i<posList.size(); i++){
                arr[i*2]=posList.get(i);
                arr[i*2+1]=negList.get(i);
            }

            int idx=posList.size()*2;
            for(int i=posList.size(); i<negList.size(); i++){
                arr[idx]=negList.get(i);
                idx++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={-1,-3,2,3,4,5,6,-4,6,5};
        int ans[]=reArrangeNumV2(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
