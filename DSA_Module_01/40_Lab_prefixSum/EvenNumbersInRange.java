public class EvenNumbersInRange {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};

        int[][] B = {
            {0,4},
            {2,4},
            {1,4},
        };
        printArr(countOfEvenNumInRange(A, B));
    }
    public static int[] countOfEvenNumInRange(int[] A, int[][] B){
        int n = A.length;
        int[] pSum = new int[n];
        if(A[0] % 2 == 0){
            pSum[0] = 1;
        }else{
            pSum[0] = 0;
        }

        for(int i = 1; i < n; i++){
            if(A[i] % 2 == 0){
                pSum[i] = pSum[i -1] + 1;
            }else{
                pSum[i] = pSum[i-1];
            }
        }
        int q = B.length;
        int[] ans = new int[q];
        for(int i = 0; i < q; i++){
            int L = B[i][0];
            int R = B[i][1];
            if(L == 0){
                ans[i] = pSum[R];
            }else{
                ans[i] = pSum[R] - pSum[L-1];
            }
        }
       return ans;

    }
    // print array

         public static void printArr(int[] arr){
            int n = arr.length;
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
           }
}


/*
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.

Each query consists of two integers B[i][0] and B[i][1].

For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
*/