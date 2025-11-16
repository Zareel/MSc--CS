public class rotateByNinetyDegree {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        int n = mat.length;

        // transpose
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // reverse
        for(int i = 0; i < n; i++){
            int start = 0; 
            int end = n-1;
            while(start < end){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
        printMat(mat);
    }

    // print mat
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
