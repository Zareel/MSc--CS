public class SmallestNumber {
    public static void main(String[] args) {
        int[] ar = {2,5,6,3,4,7,8};
        printArr(findSmallestNum(ar));

    }
    public static int[] findSmallestNum(int[] ar){
        int n = ar.length;
        int[] freq = new int[10];
        for(int i = 0; i < n; i++){
            freq[ar[i]]++;
        }
        int index = 0;
        for(int i = 0; i < 10; i++){
            int count = freq[i];
            for(int j = 1; j <= count; j++){
                ar[index] = i; 
                index++;
            }
        }
        return ar;
    }

        // print arr
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
