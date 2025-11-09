public class countOccurence {
    public static void main(String[] args) {
        String str = "bobbob";  
        System.out.println(occurenceCount(str));      
    }
    public static int occurenceCount(String str){
        int n = str.length();
        int count = 0;
        for(int i = 0; i <= n -3; i++){
            if(str.charAt(i) == 'b' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'b' ){
                count++;
            }
        }

        return count;
    }
    
}

/*
 * find the number of occurence of bob in string lowercase english alphabets
 */
