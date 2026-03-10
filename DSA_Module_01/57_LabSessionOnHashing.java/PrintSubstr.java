public class PrintSubstr {
    public static void main(String[] args) {
        String str = "abcdefgh";
        printSubString(str);    
    }

    public static void printSubString(String str){
        int n = str.length();

        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                System.out.print(str.substring(s, e) + " ");
            }
        }
    }
    
}
