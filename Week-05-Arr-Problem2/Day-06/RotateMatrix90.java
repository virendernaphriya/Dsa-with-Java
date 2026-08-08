/**
 * RotateMatrix90
 */
public class RotateMatrix90 {

    static int[][] rotateMatrixBrute(int arr[][]){
        int n=arr.length;
        int newArr[][] = new int[n][n];

        int col=n-1;
        for(int i=0; i<n; i++){
            int row=0;
            for(int j=0; j<n; j++){
                System.out.println(row +"," +col);
                newArr[row][col]=arr[i][j];
                row++;
            }
            col--;
        }

        return newArr;
    }
    static void rotateMatrixOptimal(int arr[][]){
        int n=arr.length;

        //firstly get the transpose of the matrix
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(i!=j){
                    System.out.println(i+">>>>>>>>>>>>>>>>>>>"+j);
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }

        

        //reverse each row
        for(int i=0; i<n; i++){
            int start=0;
            int end=n-1;
            while (start<end) {
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
        }

        
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        // int newArr[][]=rotateMatrixBrute(arr);
        rotateMatrixOptimal(arr);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}