public class AmazingSubarrays {
    public static void main(String[] args) {
        String str = "Zareel";
        System.out.println(amaingSubString(str));
        
    }
    public static int amaingSubString(String str){
        int n = str.length();
        long count = 0;
        String vowels = "aeiouAEIOU";

        for(int i = 0; i < n; i++){
            if(vowels.indexOf(str.charAt(i))!= -1){
                count+= n-1;
            }
        }
        return (int)(count % 10003);


    }
    
}

/*
 * You are given a string S. And you have to find all the amzing substrings of S.
 * An amazing substring is one that starts with vowels
 */
