public class PrintTrasnspose {

    public static void main(String[] args) {
       int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
    printMat(transpose(mat));

    }

    // transpose
    public static int[][] transpose(int[][] mat){
        int n = mat.length;
        int[][] result = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                result[i][j] = mat[j][i];
            }
        }
        return result;
    }

        // print mat
    public static void printMat(int[][] mat){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();

        }
    }

}