public class RotatedSortedArrSearch {
    public static void main(String[] args) {
          int[] A = {4, 5, 6, 7, 0, 1, 2};
        int B = 0;
        System.out.println(search(A, B));
    }

    public static int search(int[] A, int B){
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (A[mid] == B) {
                return mid;
            }

            // Left half is sorted
            if (A[low] <= A[mid]) {
                if (B >= A[low] && B < A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (B > A[mid] && B <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    
}
