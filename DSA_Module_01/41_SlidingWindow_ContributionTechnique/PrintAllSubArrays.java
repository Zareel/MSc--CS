import java.util.ArrayList;

public class PrintAllSubArrays {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int n = A.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                ArrayList<Integer> subArr = new ArrayList<>();
                for(int i = s; i <= e; i++){
                    subArr.add(A[i]);
                }
                result.add(subArr);
            }

        }
        System.out.println(result);
    }
    
}
