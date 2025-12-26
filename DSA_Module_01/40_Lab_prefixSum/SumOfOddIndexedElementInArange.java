public class SumOfOddIndexedElementInArange {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 15};
        int[][] B = {
            {1,4},
            {0,2},
            {2,3},
        };
        printArr(oddIndexedElement(arr, B));


    }
    public static int[] oddIndexedElement(int[] arr, int[][] B){
        int n = arr.length;

        int[] pSum = new int[n];
        pSum[0] = 0;
        for(int i = 1; i < n; i++){
            pSum[i] = pSum[i-1];
            if(i % 2 != 0){
                pSum[i] += arr[i];
            }
        }

        int q = B.length;
        int[] ans = new int[q];
        for(int i = 0; i < q; i++){
            int l = B[i][0];
            int r = B[i][1];
            int sum = 0;
            if(l == 0){
                sum = pSum[r];
            }else{
                sum = pSum[r] - pSum[l -1];
            }
            ans[i] = sum;
        }
        return ans;

           }
           public static void printArr(int[] arr){
            int n = arr.length;
            for(int i = 0; i < n; i++){
                System.out.println(arr[i]);
            }
           }
    
}


/*
You are given:
An integer array A representing the array of numbers of size N.
A 2D array B of size Q, where each row B[i] contains two integers B[i][0] and B[i][1], representing the range [L, R].

For each query in B, calculate the sum of elements in A at odd indices within the specified range [L, R] and return the results as an array.
*/
