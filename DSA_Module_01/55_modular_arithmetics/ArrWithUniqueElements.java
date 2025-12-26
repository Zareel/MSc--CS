import java.util.ArrayList;

public class ArrWithUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,9,4,5};
        System.out.println(uniquElements(arr));
    }
    public static ArrayList<Integer> uniquElements(int[] arr){
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
           
            }
                 if(count == 1){
                    result.add(arr[i]);
                }
        }
        return result;
    }
    
}


