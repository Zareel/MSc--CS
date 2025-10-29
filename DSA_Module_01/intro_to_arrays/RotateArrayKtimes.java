public class RotateArrayKtimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        arr = rotateArrayKtimes(arr, 3);
        printArr(arr);

    }
    public static int[] rotateArrayKtimes(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        for(int j = 0; j < k; j++){
            int temp = arr[n-1];
        for(int i = n-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        }
        return arr;
    }

        // print array
        public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
