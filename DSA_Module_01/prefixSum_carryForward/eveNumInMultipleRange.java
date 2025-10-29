import java.util.ArrayList;

public class eveNumInMultipleRange {
    public static void main(String[] args) {
        int[] arr = {2,4,3,7,9,8,6,3,4,9};
        int[][] mat = {{4,8}, {3,9}, {2,7}, {0,4}};
         System.out.println(evenInGivenRange(arr, mat));
    }
    public static ArrayList<Integer> evenInGivenRange(int[] arr, int[][] mat){
         ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < mat.length; i++){
           
            int L = mat[i][0], R = mat[i][1];
            int count = 0;
            for(int j = L; j <= R; j++){
                if(arr[j] % 2 == 0){
                    count++;
                }
            }
            al.add(count);
        }
        return al;

        
    }
}

//? Given an array of N elements, and  Q queries. For each query given L and R. Calculate and print number of even numbers in given range [L and R] included
