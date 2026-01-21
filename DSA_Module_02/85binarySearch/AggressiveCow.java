public class AggressiveCow {
    public static void main(String[] args) {
        int[] arr = {2,6,11,14,19,25,30,39,43};
        int totalCows = 4;
        System.out.println(maxDistance(arr, totalCows));
        
    }
    public static int maxDistance(int[] arr, int totalCows){
        int n = arr.length;
        int lo = 1;
        int hi = arr[n-1] - arr[0];
        int ans = 0;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(checkPossible(arr,mid, totalCows)){
                ans = mid;
                lo = mid + 1;
            }else{
                hi = mid-1;
            }

        }
        return ans;

    }

    public static boolean checkPossible(int[] arr, int distance, int totalCows){
        int cows = 1;
        int lastPosition = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - lastPosition >= distance){
                cows++;
                lastPosition = arr[i];
            }
            if(cows == totalCows){
                return true;
            }
        }
        return false;

    }
    
}
