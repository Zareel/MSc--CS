import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String A = "anagram";
        String B = "naamgr0";
        System.out.println(isAnagram(A, B));

    }
    public static int isAnagram(String A, String B){
     if (A.length() != B.length()) return 0;

        char[] arr1 = A.toCharArray();
        char[] arr2 = B.toCharArray();  

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return 0;
        }
        return 1;
    }
    
}
