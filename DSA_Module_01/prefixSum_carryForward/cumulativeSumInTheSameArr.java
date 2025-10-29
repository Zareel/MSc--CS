public class cumulativeSumInTheSameArr {
    public static void main(String[] args) {
        int[] arr = {-3,6,2,4,5,2,8,-9,3,1};
        printArr(cumulativeSum(arr));
    }
    public static int[] cumulativeSum(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;


    }
    
    // print arr
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
