//package prefixSum_carryForward;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int[] pSum = new int[n];
        pSum[0] = arr[0];

        for(int i = 1; i < n; i++){
            pSum[i] = pSum[i-1] + arr[i];
        }
        printArr(pSum);
     
    }

    // print arr
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
