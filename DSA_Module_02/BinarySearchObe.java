public class BinarySearchObe{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        System.out.println(binarySearch(arr, k));
        
    }
    public static boolean binarySearch(int[] arr, int k){
        int n = arr.length;
        int l = 0;
        int h = n-1;
        
        while(l <= h){
            int mid = (l + h)/2;
            if(arr[mid] == k){
                return true;
            }else if(arr[mid] > k){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return false;
    }
}

//? Binary search on Array
//? find the index of the int k