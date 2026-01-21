public class FindTheElementIndex {
   public static void main(String[] args) {
         int[] arr = {2,8,12,18,20,45,69,75};
    int k = 19;
    System.out.println(searchElement(arr, k));
   }

   public static int searchElement(int[] arr, int k){
    int n = arr.length;
    int lo = 0; 
    int hi = n-1;
    while(lo <= hi){
        int mid = lo + (hi - lo)/2;
        if(arr[mid] == k){
            return mid;
        }else if(arr[mid] > k){
            hi = mid-1;
        }else{
            lo = mid + 1;
        }
    }
    return lo;
   }
    
}
