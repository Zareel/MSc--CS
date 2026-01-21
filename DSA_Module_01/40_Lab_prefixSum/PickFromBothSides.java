public class PickFromBothSides {
    public static void main(String[] args) {
        int[] A = {5, -2, 3 , 1, 2};
        int B = 3;
        System.out.println(maxSum(A, B));
        
    }

    public static int maxSum(int[] A, int B){
        int N = A.length;
        
       
        int maxSum = 0;
        for (int i = 0; i < B; i++) {
            maxSum += A[i];
        }

        int currentSum = maxSum;
    
        for (int i = 1; i <= B; i++) {
            currentSum = currentSum - A[B - i] + A[N - i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    
}

/*
you are given an integer array of size n; 
you have to perform B operations. in one operation you can remove either the left most or the right most element of the arra A
find and return the maximum possible sum of the B elements that were removed after the B operations  
*/
