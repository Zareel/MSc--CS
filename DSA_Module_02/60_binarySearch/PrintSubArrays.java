public class PrintSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printSubArr(arr);

    }
   public static void printSubArr(int[] arr){
    int n = arr.length;
    for(int s = 0; s < n; s++){
        for(int e = 0; e < n; e++){
            for(int i = s; i < e; i++){
                System.out.print(arr[i]  + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

   } 
    
}
