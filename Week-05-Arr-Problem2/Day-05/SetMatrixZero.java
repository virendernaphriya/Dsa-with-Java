import java.util.HashSet;

public class SetMatrixZero {
    static void setMatrixZeroBrute(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for(int row:rowSet){
            for(int j=0; j<n; j++){
                arr[row][j]=0;
            }
        }
        for(int col:colSet){
            for(int j=0; j<m; j++){
                arr[j][col]=0;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        setMatrixZeroBrute(arr);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }
}
