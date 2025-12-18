public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {10,11,12,13,14}
        };
        int B = 15;
        System.out.println(searchMat(matrix, B));
        
    }
    public static int searchMat(int[][] mat, int B){
        int n = mat.length;
        int m = mat[0].length;
        int l = 0, h = n*m-1;

        while(l <= h){
            int mid = (l+h)/2;
            int row = mid/m;
            int col = mid%m;

            if(mat[row][col] == B) return 1;
            else if(mat[row][col] < B) l = mid +1;
            else h = mid-1;
        }
        return 0;
    }
    
}


/*
* Given a matrix of integers A of size N x M and an integer B. Write an efficient algorithm that searches for integer B in Matrix
* The matrix has the following properties
1. Integers in each row are sorted
2. The first integer of each row is greater than or equal to the last integer of the previous row return 1 if B is present else return 0.
*/
