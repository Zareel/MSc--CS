import java.util.Arrays;

public class ToggleCase {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(changeCase(str));
       
        
    }
    
    public static String changeCase(String str){
         char[] arr = str.toCharArray();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - 32);  // convert lowercase to uppercase
            } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32);  // convert uppercase to lowercase
            }
        }
        return new String(arr);
        // or Arrays.toString(arr)

    }
}
