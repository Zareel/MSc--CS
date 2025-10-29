public class printSubarrays {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3,-1,6,9,8,12};
        printSubarray(arr, 2, 7);
       
     
    }

    public static void printSubarray(int[] arr, int s, int e){
        for(int i = s; i <= e; i++){
            System.out.print(arr[i] + " ");
        }

    }
    
}
