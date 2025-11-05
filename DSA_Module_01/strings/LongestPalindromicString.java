public class LongestPalindromicString {
    public static void main(String[] args) {
      String str = "ltmadampi";
      System.out.println(longestPalindromicCount(str));
      
    }
    public static int longestPalindromicCount(String str){
        int ans = 0, n = str.length();
        for(int i = 0; i < n; i++){
            //! odd length palindrom centered at i 
            int l = i , r = i;
            while(l >= 0  && r < n  && str.charAt(l) == str.charAt(r) ){
             ans = Math.max(ans, r-l+1);
                    l--;
                    r++;
                }


                  //! even length palindrome centered between i and i + 1
            l = i;
            r = i+1;
            while(l >= 0 && r < n && str.charAt(l) == str.charAt(r)){
                ans = Math.max(ans, r-l+1);
                l--;
                r++;
            }
            }
            return ans;   

    }
  

}
