public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,5,6,6,6,7,8,8,8,8,9,9,9};
        int k = 8;
        System.out.println(indexOfFirstOccurence(arr, k));

    }
    public static int indexOfFirstOccurence(int[] arr, int k){
        int n = arr.length;
        int l = 0;
        int h = n-1;
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
