public class GoogleQuestion {
    public static void main(String[] args) {
        int[] arr = {3,6,9,12,14,19,2,23,25,27, 5,10,20};
        System.out.println(localMinima(arr));
        
        
    }
    public static int localMinima(int[] arr){
        int n = arr.length;
        int l = 0,  h = n-1;
        while(l <= h){
            int mid = (l+h)/2;
            boolean leftOk = (mid == 0 || arr[mid-1] >= arr[mid]);
            boolean rightOk = (mid == n-1 || arr[mid -1] > arr[mid]);
            if(leftOk && rightOk){
                return arr[mid]; 
            }

            if(mid < n-1 && arr[mid] > arr[mid]-1){
                l = mid+1;
            }else{
                h = mid -1;
            }
        }
        return -1;

    }
    
}

/*
* Local minima
given an unsorted arr[]. with all distinct elements return any one local minima
local minima => an element is said to be local minima, if it is smaller than its adjuscent element (immediate left and right)
*/
