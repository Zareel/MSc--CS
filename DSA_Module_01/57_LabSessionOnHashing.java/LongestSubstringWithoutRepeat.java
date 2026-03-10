import java.util.HashSet;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
     String str = "abcabcbbcc";
     System.out.println(findLongestSubString(str));   
    }
    public static int findLongestSubString(String str){

        HashSet<Character> hs = new HashSet<>();

        int n = str.length();
        int s = 0;
        int e = 0;
        int maxLen = 0;
        while(e < n){
            while (hs.contains(str.charAt(e))) {
                hs.remove(str.charAt(s));
                s++;
            }

            hs.add(str.charAt(e));
            maxLen =Math.max(maxLen, e-s+1);
            e++;
        
        }
        return maxLen;
    } 
    
}
