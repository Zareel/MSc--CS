public class SpecialSubsequences {
    public static void main(String[] args) {
        
    }
    
}



/*
You have given a string A having Uppercase English letters.

You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.

public class Solution {
    public long solve(String A) {
        int n = A.length();
      long count = 0;
      long ans = 0;
      for(int i = 0; i < n; i++){
          if(A.charAt(i) == 'A'){
              count++;
          }else if(A.charAt(i) == 'G'){
              ans+=count;
          }
      }

        return ans;
    }
}
*/
