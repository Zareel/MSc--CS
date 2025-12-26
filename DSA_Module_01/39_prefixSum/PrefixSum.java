public class PrefixSum{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int[] result = new int[n];
        result[0] = arr[0];
        for(int i = 1; i < n; i++ ){
            result[i] = arr[i-1] + arr[i];
        } 

        printArr(result);
    }
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}