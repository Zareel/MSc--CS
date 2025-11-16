public class LongestConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1};
        System.out.println(findCount(arr));

    }
    public static int findCount(int[] arr){
        int n = arr.length;
        int maxLen = 0;
        int curr = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                curr++;
                if(curr > maxLen){
                    maxLen = curr;
                }
            }else{
                curr = 0;
            }
        }
        return maxLen;
    }
    
}
