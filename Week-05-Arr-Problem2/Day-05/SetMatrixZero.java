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


    //worked for non negative nums only
    static void setMatrixZeroBrute2(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==0){
                    markRow(i,arr);
                    markCol(j,arr);
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }

    }

    static void markRow(int row,int arr[][]){
        int n= arr[0].length;
        for(int i=0; i<n; i++){
            if(arr[row][i]!=0){
                arr[row][i]=-1;
            }
        }
    }
    static void markCol(int col,int arr[][]){
        int m= arr.length;
        for(int i=0; i<m; i++){
            if(arr[i][col]!=0){
                arr[i][col]=-1;
            }
        }
    }


    static void setMatrixZeroBetter(int arr[][]){
        int m=arr.length;
        int n= arr[0].length;

        int row[] = new int[n];
        int col[]= new int[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        setMatrixZeroBetter(arr);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }
}
