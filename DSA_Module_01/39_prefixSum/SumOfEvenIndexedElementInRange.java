public class SumOfEvenIndexedElementInRange {
    public static void main(String[] args) {
        int[] A = {2,4,3,7,9,8,6,3,4,9};
          int[][] B = {
        {4,8},
        {3,9},
        {2,7},
        {0,4},
    };
    printArr(findSumOfEvenIndexedEle(A, B));

        
    }

    public static int[] findSumOfEvenIndexedEle(int[] A, int[][] B){
        int n = A.length;
        int[] pSum = new int[n];
        pSum[0] = A[0];
        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
                pSum[i] = pSum[i-1] + A[i];
            }else{
                pSum[i] = pSum[i-1];
            }
        }
        int q = B.length;
        int[] ans = new int[q];
        for(int i = 0; i < q; i++){
            int L = B[i][0];
            int R = B[i][1];
            int sum = 0;
            if(L==0){
                sum = pSum[R];
            }else{
                sum = pSum[R] - pSum[L-1];
            }
            ans[i] = sum;
    
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
/*
Given an array having N elements and  Q queries. For each quries given L and R. Calculat and print Sum of even indexed elements in given range 
*/