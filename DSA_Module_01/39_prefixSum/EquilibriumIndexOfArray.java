public class EquilibriumIndexOfArray {
    public static void main(String[] args) {
      int[]  A = {-7, 1, 5, 2, -4, 3, 0};
      findEqulibriumIndex(A);

    
        
    }
    public static int findEqulibriumIndex(int[] A){
        int n = A.length;
        // find the totalSum
        int totalSum = 0;
        for(int i = 0; i < n; i++){
            totalSum += A[i];
        }

        int leftSum = 0;
        for(int i = 0; i < n; i++){
            int rightSum = totalSum - leftSum - A[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += A[i];
        }
        return -1;
    }
    
}

/*
you are given an array A of integers of size N;
your task is to find the equilibrium index of the array
the equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of the elements at the higher indexes.
if there are no elements that are at lower indexes or at higher indexes then the currespoinding sum of elements is considered as 0;

*/
