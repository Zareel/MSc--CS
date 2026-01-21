public class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 15};
        int[][] B = {
            {1,4},
            {0,2},
            {2,3},
        };
        printArr(solve(arr, B));

        
    }
    public static int[] solve(int[] A, int[][] B){
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
        int[] result = new int[q];
        for(int i = 0; i < q; i++){
            int L = B[i][0];
            int R = B[i][1];
            int sum = 0;
            if(L == 0){
                sum = pOdd[R];
            }else{
                sum = pOdd[R] - pOdd[L-1];
            }
            result[i] = sum;
        }
   
        return result;
    }

      public static void printArr(int[] arr){
            int n = arr.length;
            for(int i = 0; i < n; i++){
                System.out.println(arr[i]);
            }
           }
    
}

/*

*/
