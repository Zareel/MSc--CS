public class SearchForArange {
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,2,3,3,6,6,6,5,5,5,5,4,4,4,4};
        int k = 2;
        printArr(rangeSearch(arr, k));

    }
    public static int[] rangeSearch(int[] arr, int k){
        int[] result = new int[2];
        result[0] = firstOcc(arr, k);
        result[1] = lastOcc(arr, k);
        return result;
    }

    public static int firstOcc(int[] arr, int k){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int ans = -1;
        while(lo <= hi){
            int mid = lo+ (hi- lo)/2;
            if(arr[mid]==k){
                ans = mid;
                hi = mid-1;
            }else if(arr[mid] > k){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }

      public static int lastOcc(int[] arr, int k){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int ans = -1;
        while(lo <= hi){
            int mid = lo+ (hi- lo)/2;
            if(arr[mid]==k){
                ans = mid;
                lo = mid+1;
            }else if(arr[mid] > k){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    
}
