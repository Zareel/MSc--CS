public @interface RangeSumQuery {

    
}

/* 
  You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
Input 1:


A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Output 1:
[10, 5]
*/
