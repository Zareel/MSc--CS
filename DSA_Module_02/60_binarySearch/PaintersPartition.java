public class PaintersPartition {
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};
        int k = 4;
        System.out.println(painterPart(arr, k));
      
    }
    public static int painterPart(int[] arr, int k){
        int n = arr.length;
        int max = arr[0];
        int sum = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int l = max, h = sum, ans = 0;
        while(l <= h){
            int mid = (l + h)/2;
            if(checkPossible(arr, mid, k)){
                ans = mid;
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;

    }

    public static boolean checkPossible(int[] arr, int time, int totalPainters){
        int p = 1;
        int currSum = 0;
        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
            if(currSum > time){
                p++;
                currSum = arr[i];
            }
        }
        return (p <= totalPainters);
    }
    
}   

/*
* Given n boards with length of each boards
* There are k painters available to paint all boards calculate and return the minimum time to get the job done
a painter takes one unit of time to paint one unit
one board can only be painted by one painter
a painter can onlu pantee
*/
