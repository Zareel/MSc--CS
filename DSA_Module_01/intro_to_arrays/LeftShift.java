public class LeftShift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        arr = leftShift(arr);
        printArr(arr);
    }

    public static int[] leftShift(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 0; i < n-1; i++){
            arr[i] =  arr[i+1];
        }
        arr[n-1] = temp;
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
