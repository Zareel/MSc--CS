import java.util.ArrayList;

public class GenerateAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                ArrayList<Integer> subArr = new ArrayList<>();
                for(int i = s; i <= e; i++){
                    subArr.add(arr[i]);
                }
                result.add(subArr);
            }
            
        }
        System.out.println(result);
        
    }
    
}

/*
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.
*/
