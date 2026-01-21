public class MaxOfKlengthSubArrays {
    public static void main(String[] args) {
        int[] A = {-3,4,-2,5,3,-2,8,2,-1,4};
        System.out.println(maxSub(A,  6));

        
    }
    public static long maxSub(int[] A, int k){
        int N = A.length;
        int s = 0;
        int e = k-1;
        long ans = Long.MIN_VALUE; 
        while(e < N){
            long sum = 0;
            for(int i = s; i <= e; i++){
                sum += A[i];
            }
            ans = Math.max(ans, sum);  
            s++;
            e++;                                                                                       
        }
        return ans;

    }
    
}

/*
Given an array of length N. find all the subarray of k length and find the max among those
*/
