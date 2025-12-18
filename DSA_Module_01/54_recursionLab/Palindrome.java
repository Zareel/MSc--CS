public class Palindrome {
    public static void main(String[] args) {
        
    }
    
}

/*
* write a recursive function that checks whether string A is a palindrome or not. Return 1 if the string A is a palindrome, else return 0.

public class Solution {
    public int solve(String A) {
  
        return isPal(A, 0, A.length() - 1) ? 1 : 0;
    }

    public static boolean isPal(String str, int s, int e) {
        if (s >= e) return true;

        if (str.charAt(s) != str.charAt(e)) return false;

        return isPal(str, s + 1, e - 1);
    }
}

*/
