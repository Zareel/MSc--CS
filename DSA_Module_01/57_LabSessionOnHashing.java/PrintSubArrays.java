import java.util.ArrayList;

public class PrintSubArrays {

     public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(generateSubArrays(arr));
     }

     public static ArrayList<ArrayList<Integer>> generateSubArrays(int[] arr){
        int n = arr.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                ArrayList<Integer> ans = new ArrayList<>();
                for(int i = s; i <= e; i++){
                    ans.add(arr[i]);
                }
                result.add(ans);
                
            }
        }
        return result;
     }
}