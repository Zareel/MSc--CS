public class FindK{
    public static void main(String[] args){
        int[] arr = {3,6,9,12,14,19,20,23,25,27};
        int k = 3;
        System.out.println(isKpresent(arr, k));

    }
    public static boolean isKpresent(int[] arr, int k){
        int n = arr.length;
        int l = 0;
        int h = n-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] == k){
                return true;
            }else if(arr[mid]> k){
                h = mid-1;
            }else{
                l = mid+1;
            }

        }
        return false;

    }
}

// * Given a sorted array A, search if K is present or not