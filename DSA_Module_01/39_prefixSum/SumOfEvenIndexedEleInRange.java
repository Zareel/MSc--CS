public class SumOfEvenIndexedEleInRange {
public static void main(String[] args) {
        int[] A = {2,4,3,7,9,8,6,3,4,9};
    int[][] Q = {
       {4,8},
        {3,9},
        {2,7},
        {0,4},
    };
    printArr(findSum(A, Q));
}

public static int[] findSum(int[] A, int[][] Q){
      int n = A.length;

        // Prefix sum for EVEN indices only
        int[] pSum = new int[n];
        pSum[0] = A[0]; // index 0 is even

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                      pSum[i] = pSum[i - 1] + A[i];
               
            } else {
          
                   pSum[i] = pSum[i - 1];
            }
        }

        int[] ans = new int[Q.length];

        for (int i = 0; i < Q.length; i++) {
            int L = Q[i][0];
            int R = Q[i][1];

            if (L == 0) {
                ans[i] = pSum[R];
            } else {
                ans[i] = pSum[R] - pSum[L - 1];
            }
        }

        return ans;
       
    }

      public static void printArr(int[] A){
        int n = A.length;
        for(int i= 0;i < n; i++){
            System.out.print(A[i] + " ");
        }
    }

}


    



/*
import java.util.Arrays;

public class SumOfEvenIndexedEleInRange {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        int[][] Q = {
            {1, 4},
            {0, 2},
            {2, 3}
        };

        System.out.println(Arrays.toString(findSum(A, Q)));
    }

    public static int[] findSum(int[] A, int[][] Q) {
        int n = A.length;

        // Prefix sum for EVEN indices only
        int[] pSum = new int[n];
        pSum[0] = A[0]; // index 0 is even

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                pSum[i] = pSum[i - 1] + A[i];
            } else {
                pSum[i] = pSum[i - 1];
            }
        }

        int[] ans = new int[Q.length];

        for (int i = 0; i < Q.length; i++) {
            int L = Q[i][0];
            int R = Q[i][1];

            if (L == 0) {
                ans[i] = pSum[R];
            } else {
                ans[i] = pSum[R] - pSum[L - 1];
            }
        }

        return ans;
    }
}
*/
