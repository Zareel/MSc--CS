public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(reverseStr(str));


    }
    public static String reverseStr(String str){
        char[] arr = str.toCharArray();

        int n = arr.length;
        int s = 0;
        int e = n-1;
      
           while (s < e) {
             char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
           }
       

        return new String(arr);

    }
}
