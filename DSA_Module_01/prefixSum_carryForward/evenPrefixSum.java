public class evenPrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[][] queries = {{1,3}, {2,4}, {0,5}};
        int[] result = evenIndexPrefixSum(arr, queries);
        printArr(result);
    }
    public static int[] evenIndexPrefixSum(int[] arr, int[][] queries){
        int[] pEven = new int[arr.length];
        pEven[0] = arr[0];
        for(int i = 1; i < arr.length; i++){

            if(i % 2 == 0){
                pEven[i] = pEven[i-1] + arr[i];
            }else{
                pEven[i] = pEven[i-1];
            }
        }

        
        int[] ans = new int[queries.length];
         for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            if(L == 0){
                ans[i] = pEven[R];
            }else{
                ans[i] = pEven[R] - pEven[L-1];
            }
        }
        return ans;

    }

    // print arr
      // print arr
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}

// find the sum of even index number from the qurues using prefix sum and retun the pEven array
