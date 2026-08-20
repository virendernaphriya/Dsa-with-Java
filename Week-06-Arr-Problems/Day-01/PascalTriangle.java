import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    //FIRST TYPE OF PROBLEM , IF WE HAVE GIVEN ROWNUM AND COLNUM , THEN WE HAVE TO FIND THE ELEMENT, THAT AT THAT ROW WHICH ELE IS PRESENT AND THERE IS VERY SIMPLE FORMULA TO GET THIS

    //LESTS ASSUME ROWNUM IS N AND COLNUM/IDX IS R THEN THE FORMULA WILL BE nCr
    //n-1!/r-1!*(n-1-r-1)!


    static int getValueOfEl(int n, int r){
        int res=1;
        for(int i=0; i<r; i++){
            res *=n-i;
            res/=i+1;
        }

        return res;
    }

    static List<Integer> printNthRow(int row){
        int ans=1;
        List<Integer> list = new ArrayList<>();
        list.add(ans);

        for(int i=1; i<row; i++){
            ans*=row-i;
            ans/=i;
            list.add(ans);
        }
        return list;
    }

    static List<List<Integer>> pascalTriangle(int row){
        List<List<Integer>> list=new ArrayList<>();

        for(int i=1; i<=row; i++ ){
            list.add(printNthRow(i));
        }

        return list;
    }
    public static void main(String[] args) {
        // System.out.println(getValueOfEl(4, 2));

        // List<Integer>  list=printNthRow(6);
        List<List<Integer>>  list=pascalTriangle(6);

        System.out.println(list);
    }
}