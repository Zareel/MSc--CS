public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,9,5,4,7,8,9,3};
        System.out.println(findPeak(arr));
    
    }
    public static int findPeak(int[] A){
        int n = A.length;
        if(n == 1) return A[0];
        if(A[0] > A[1]) return A[0];
        if(A[n-1] > A[n-2]) return A[n-1];
        int lo = 1;
        int hi = n-2;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(A[mid] > A[mid -1] && A[mid] > A[mid + 1]){
                return A[mid];
            }else if(A[mid] > A[mid - 1] && A[mid] < A[mid+1]){
                lo = mid +1;
            }else{
                hi = mid - 1;
            }
        }
        return -1;
    }
}
