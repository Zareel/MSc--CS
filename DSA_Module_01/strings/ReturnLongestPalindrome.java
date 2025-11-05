public class ReturnLongestPalindrome {
    public static void main(String[] args) {
        String str = "kgjmadampoi";
        System.out.println(longestPalindromicString(str));
    }
    public static String longestPalindromicString(String str){
        int n = str.length();
        int start = 0;
        int end = 0;

        for(int i = 0;i < n; i++){
            int l = i; int r = i;
            while(l >=0 && r < n && str.charAt(l) == str.charAt(r)){
                if(r-l > end -start){
                    start = l;
                    end = r;
                }
                l--; r++;
            }

            l = i; r = i+1;

                while(l >=0 && r < n && str.charAt(l) == str.charAt(r)){
                if(r-l > end -start){
                    start = l;
                    end = r;
                }
                l--; r++;
            }

        }

        return str.substring(start, end+1);
    }
}
