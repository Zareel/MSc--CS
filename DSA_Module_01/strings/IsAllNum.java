public class IsAllNum {
    public static void main(String[] args) {
        char[] arr = {'a', 'g','1', 'e', '5','D', '#'};
        System.out.println(isAlpha(arr));
        
    }
    public static int isAlpha(char[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            char c = arr[i];
            if(!((c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9'))){
                return 0;
            }
        }
        return 1;
    }
    
}

/*
 * you are given a function isAlpha() consisting of a charater array A. Return 1 if all the characters of the character array  are alpha numeric (a-z, A-Z, and 0-9) else return 0;
 */