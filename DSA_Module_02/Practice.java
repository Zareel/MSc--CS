public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,5,5,6,6,6,7,8,8,8,8,9,9,9};
        int k = 5;
        System.out.println(firstOcc(arr, k));
        
    }

    public static int firstOcc(int[] arr, int k){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int ans = -1;
        while(lo <= hi){
            int mid = lo + (hi -lo)/2;
            if(arr[mid] == k){
                ans = mid;
                hi = mid - 1;

            }else if(arr[mid] > k){
                hi = mid-1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    
}
