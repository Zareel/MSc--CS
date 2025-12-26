

public class PrintUniqueElements {
    public static void main(String[] args) {
        int[]  arr = {1,5,6,4,2,8,5,6,2,8};
        uniqueElements(arr);
    }
    public static void uniqueElements(int[] arr){
     int n = arr.length;
     for(int i = 0; i < n; i++){
        int count = 0;
        for(int j = 0; j < n; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        if(count == 1){
            System.out.print(arr[i] + " ");
        }
     }
      
    }
    
}
