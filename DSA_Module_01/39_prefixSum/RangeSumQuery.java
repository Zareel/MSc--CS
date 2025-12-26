public class RangeSumQuery {
    public static void main(String[] args) {
          int[] arr = {1,2,3,4,5};
          
        int n = arr.length; 
        int[] pSum = new int[n];
        // pSum array
        pSum[0] = arr[0];
        for(int i = 1; i < n; i++ ){
            pSum[i] = pSum[i-1] + arr[i];
        } 
        
        int[][] queries = {{0,3}, {1,2}};
        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int sum = 0;
            if(l == 0){
                sum = pSum[r];
            }else{
                sum = pSum[r] - pSum[l-1];
            }
            result[i] = sum;
        }

        printArr(result);
    }

      public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
