public class LongestCommonPrefix {
    public static void main(String[] args) {
    String[] A = {"flower", "flow, flora"};  
    }

    public static String commonPrefix(String[] A){
        if(A == null || A.length ==0){
            return "";
        }
        // start with the first string as prefix
        String prefix = A[0];
        for(int i = 1; i < A.length; i++){
            // compare prefix with next string
            while(A[i].indexOf(prefix) != 0){
                // shorten the prefix by one character
                prefix = prefix.substring(0,  prefix.length()-1);
                // if prefix becomes empty, no common prefix exists
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}

/*
 * Given the array of String A. You need to find the longest string S, which is the prefix of all the string in the array
 * The longest common prefix for a pair S1 and S2 is the longest String S which is the prefix of both S1 and S2
 * Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc"
 * 
 */
