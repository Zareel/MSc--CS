public class SpecialIndex {
    public static void main(String[] args) {
        int[] A = {4,3,2,7,6,-2};
        System.out.println(countSpecialIndices(A));

        
    }
    public static int countSpecialIndices(int[] A){
       int n = A.length;
        int[] pEven = new int[n];
        int[] pOdd = new int[n];

        pEven[0] = A[0];
        pOdd[0] = 0;

        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
                pEven[i] = pEven[i-1] + A[i];
                pOdd[i] = pOdd[i - 1];
            }else{
                pEven[i] = pEven[i-1];
                pOdd[i] = pOdd[i-1] + A[i];

            }

        }
        int count = 0;
        int SE = 0;
        int SO = 0;

        for(int i = 0; i < n; i++){
            if(i == 0){
                SE = pOdd[n-1] - pOdd[i];
                SO = pEven[n-1] - pEven[i];
            }else{
                SE = pEven[i-1] + pOdd[n-1] - pOdd[i];
                SO = pOdd[i-1] + pEven[n-1] - pEven[i];
            }
        if(SE == SO) count++;

        } 
        return count;
    }
    
}


/*
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
*/
