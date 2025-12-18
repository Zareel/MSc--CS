public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {-5,-5,-3,0,0,1,1,5,5,5,5,5,5,8,10,10,15};
        int k = -5;
        System.out.println(findFirstOccurence(arr, k));
    }
    public static int findFirstOccurence(int[] arr, int k){
        int n = arr.length;
        int l = 0, h = n-1;
        int ans = -1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] == k){
                ans = mid;
                h = mid-1;
            }else if(arr[mid] > k){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
    
}
