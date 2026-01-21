public class FindTheProfitOfGivenRange {
    public static void main(String[] args) {
        int[] A = {-5,10,20,40,50,-10,80,-90,-20,-10};
        int[][] B = {
            {0,9},
            {0,0},
            {7,9},
            {2,7},
            {4,9}
        };
        printArr(preFixSum(A, B));
        
    }

    public static int[] preFixSum(int[] A, int[][] B){
        int n = A.length;
        int[] pSum = new int[n];
        pSum[0] = A[0];
        for(int i = 1; i < n; i++){
            pSum[i] = pSum[i-1] + A[i];
        }

        int q = B.length;
        int[] ans = new int[q];
        for(int i = 0; i < q; i++){
            int L = B[i][0];
            int R = B[i][1];
            int sum = 0;
            if(L == 0){
                sum = pSum[R];
            }else{
                sum = pSum[R] - pSum[L-1];
            }
            ans[i] = sum;
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
Given an array, ith element represents the profit of loss. calculate the total profit or loss over the given range
*/
