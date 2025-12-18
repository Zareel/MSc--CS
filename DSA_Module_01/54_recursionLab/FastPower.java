public class FastPower {
    public static void main(String[] args) {
        
    }
    
}

/*
Given two positive integers A and B. Implement Fast Power function to compute AB

public class Solution {
    public long power(int A, int B) {
        if(B == 0) return 1;

        long half = power(A, B/2);
        
        if(B % 2 == 0){
            return half * half;

        }else{
               return half * half * A;
        }
    }
}
*/
