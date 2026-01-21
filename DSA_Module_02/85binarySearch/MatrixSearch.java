public class MatrixSearch {
    public static void main(String[] args) {
         int[][] A = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int B = 33;
        System.out.println(seachTheElementImMat(A, B));
    
    }
    public static int seachTheElementImMat(int[][] A, int B){
        int n = A.length;
        int m = A[0].length;
        int lo = 0; 
        int hi = n * m -1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            int row = mid/m;
            int col = mid % m;
            if(A[row][col] == B){
                return 1;
            }else if(A[row][col] < B){
                lo = mid + 1;

            }else{
                hi = mid -1;
            }
        }
        return -1;
    }
}


/*
Given a matrix of integers A of size N * M, and an integer B. Search B in A. 
each row of the matrix is sorted from left to right


*/