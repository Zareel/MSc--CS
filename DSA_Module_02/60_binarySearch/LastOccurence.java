public class LastOccurence {
    public static void main(String[] args) {
            int[] arr = {-5,-5,-3,0,0,1,1,5,5,5,5,5,5,8,10,10,15};
            int k = -5;
        System.out.println(findLastOccurence(arr, k));
    }
    public static int findLastOccurence(int[] arr, int k){
        int n = arr.length;
        int l = 0, h = n-1;
        int ans = -1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] == k){
                ans = mid;
                l = mid + 1;
            }else if(arr[mid] > k){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
}
