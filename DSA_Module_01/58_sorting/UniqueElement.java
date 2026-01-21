public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3};
        System.out.println(findUniqueEle(arr));

    }
    public static int findUniqueEle(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                result[i] = count;
            }
        }
        for(int i = 0; i < n; i++){
            if(result[i] == 1){
                return arr[i];
            }
        }
        return -1;
    }

      // print arr
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
