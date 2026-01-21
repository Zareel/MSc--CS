public class OddIndexedElementsInRange {
    public static void main(String[] args) {
        int[] A = {2,4,3,7,9,8,6,3,4,9};
        int[][] Q = {
        {4,8},
        {3,9},
        {2,7},
        {0,4},
    };

    printArr(findOddIndexedElementSum(A, Q));
        
    }
    public static int[] findOddIndexedElementSum(int[] A, int[][] B){
        int n = A.length;
        int[] pOdd = new int[n];
        pOdd[0] = 0;
        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
                pOdd[i] = pOdd[i-1];
            }else{
                pOdd[i] = pOdd[i-1] + A[i];
            }
        }

        int q = B.length;
        int[] ans = new int[q];
        for(int i = 0;i < q; i++){
            int L = B[i][0];
            int R = B[i][1];
            if(L == 0){
                ans[i] = pOdd[R];
            }else{
                ans[i] = pOdd[R] - pOdd[L - 1];
            }
        }
        return ans;
    }

    

    // print arr
        public static void printArr(int[] A){
        int n = A.length;
        for(int i= 0;i < n; i++){
            System.out.print(A[i] + " ");
        }
    }
    
}
