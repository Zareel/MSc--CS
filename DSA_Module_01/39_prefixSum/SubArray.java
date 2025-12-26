
import java.util.ArrayList;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(allSubArr(arr));
        
    }

    public static ArrayList<ArrayList<Integer>> allSubArr(int[] arr){
        int n = arr.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int s = 0; s < n; s++){
            for(int e = s; e < n;e++){
                ArrayList<Integer> subArr = new ArrayList<>();
                for(int i = s; i <= e; i++){
                    subArr.add(arr[i]);
                }
                result.add(subArr);
            }
            
        }
        return result;
    }

  
    
}
