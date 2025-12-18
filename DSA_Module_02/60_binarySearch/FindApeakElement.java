public class FindApeakElement {
    public static void main(String[] args) {
         int[] arr = {3,6,9,12,14,19,2,23,25,27, 5,10,20};
         System.out.println(findThePeakElement(arr));
    }
    public static int findThePeakElement(int[] arr){
        int n = arr.length;
        int l = 0, h = n-1;

        while(l <= h){
            int mid = (l+h)/2;
            boolean leftOk = (mid == 0 || arr[mid] >= arr[mid-1]);
            boolean rightOk = (mid == n-1 || arr[mid] >= arr[mid+1]);
            if(leftOk && rightOk){
                return arr[mid];
            }
            if(mid < n-1 && arr[mid] > arr[mid-1]){
                l = mid + 1;
            }else{
                h = mid -1;
            }
        }
        return -1;
       
    }
    
}

/*
Given an array of integers A. find and return the peak elements in it. An array element is considered peak if it is not smaller
than its neighbors. For corner elements, we need to consider only one neighbor 
*/
