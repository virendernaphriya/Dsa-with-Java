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


    public static void main(String[] args) {
        System.out.println(getValueOfEl(4, 2));
    }
}