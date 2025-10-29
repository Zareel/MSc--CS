public class ReverseRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int k = 3;
        reverseRange(arr, 0, n-1);
        reverseRange(arr,0, k-1);
        reverseRange(arr, k, n-1);
        printArr(arr);

    }

    public static int[] reverseRange(int[] arr, int s, int e){
        
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
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
