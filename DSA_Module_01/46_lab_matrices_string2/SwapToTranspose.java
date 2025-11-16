public class SwapToTranspose {
    public static void main(String[] args) {
          int[][] mat = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
          transpose(mat);
          reverse(mat);
          printMat(mat);
    }

    // swap to transpose
    public static int[][] transpose(int[][] mat){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
   
    }

    // reverse the mat
    public static int[][] reverse(int[][] mat){
        int n = mat.length;
        for(int i = 0; i < n; i++){
         int left = 0;
         int right = n-1;
         while(right > left){
            int temp = mat[i][left];
            mat[i][left] = mat[i][right];
            mat[i][right] = temp;
            left++;
            right--;
            
         }
        }
        return mat;
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
