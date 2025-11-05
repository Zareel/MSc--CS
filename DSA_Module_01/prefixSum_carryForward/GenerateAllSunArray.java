import java.util.ArrayList;

public class GenerateAllSunArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(generateSubArrays(arr));
    }

    public static ArrayList<ArrayList<Integer>> generateSubArrays(int[] arr){
        int n = arr.length;
        ArrayList<ArrayList<Integer>> reuslt = new ArrayList<>();
        
        for(int s = 0; s < n; s++){
           
            for(int e = s; e < n; e++){
                 ArrayList<Integer> temp = new ArrayList<>();
                for(int i = s; i <= e; i++){
                    temp.add(arr[i]);
                }
                reuslt.add(temp);

            }
            
        }
        return reuslt;
    }
    
}
/*
 * You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.
 */
