import java.util.Arrays;

public class WorkSpace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 4;
        rotateArr(arr, k);
        System.out.println(Arrays.toString(arr));
   
    }

    public static int[] rotateArr(int[] arr, int k){
        int n = arr.length;
         k = k % n;  //handle cases where k > n

        //  reverse first k elements
        reverseArr(arr, 0, k-1);

        // reverse the rest of the elements
        reverseArr(arr, k, n-1);

        // reverse the entire arr
        reverseArr(arr, 0, n-1);

        return arr;

     
    }

    // reverse the arr
    public static void reverseArr(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
