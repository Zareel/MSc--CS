public class ConsecutiveOnesWhenReplacesAzero {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,1,0,1,1,0};
        System.out.println(maxOnes(arr));

    }
    public static int maxOnes(int[] arr){
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
            }
        }
        if(count == n) return count;
        int l = 0;
        int ans = 0;
        // counting starting 1s of the array
        int i = 0;
        while (i < n && arr[i] == 1) {
            l++;
            i++;
            
        }
        // counting 1s of right side of 0
        while(i < n){
            int r = 0;
            int j = i+1;
            while(j < n && arr[j] == 1){
                r++;
                j++;
            }
            if(l+r == count){
                ans = Math.max(ans, l+r);
            }else{
                ans = Math.max(ans,l+r+1);
            }
            l = r; 
            i=j;
        }
        return ans;

    }
    
}
