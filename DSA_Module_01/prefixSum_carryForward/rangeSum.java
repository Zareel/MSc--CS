public class rangeSum{
    public static void main(String[] args) {
        int[] arr = {5,5,4,10,6,4,6,8,4};
        long[] pSumArr = findPrefixSum(arr);
        
        printArr(pSumArr);
        System.out.println();

        long rangeSumOfPsum = findRangeSum(pSumArr, 4, 8);
        System.out.println(rangeSumOfPsum);

    }
    // prefix sum
    public static long[] findPrefixSum(int[] arr){
        int n = arr.length;
        long[] pSum = new long[n];
        pSum[0] = arr[0];
        for(int i = 1; i < n; i++){
            pSum[i] = pSum[i-1] + arr[i];
        }
        return pSum;
    }

    // find rangeSum
    public static long findRangeSum(long[] pSumArr, int L, int R){
        long ans = 0;
        if(L == 0){
            ans =  pSumArr[R];
        }else{
         ans =  pSumArr[R] - pSumArr[L-1];
        }
        return ans;
    }

       // print arr
    public static void printArr(long[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}

// find the prefix sum of the given range of array
