public class Contribution {
    public static void main(String[] args) {
        int[] A = {2,8,-1,4};
        System.out.println(subArraySum(A));
    
    }
    public static long subArraySum(int[] A){
        int n = A.length;;
        long ans = 0;
        for(int i = 0;i < n;i++){
            long occ = (long) (i + 1) * (n - i);
            long count = A[i] * occ;
            ans += count;
        }
        return ans;
    }
    
}

/*
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
*/
