import java.util.ArrayList;
import java.util.Scanner;

public class multipleRangeSum {
    public static void main(String[] args) {
        int[] arr = {5,10,14,24,30,34,40,48,52};


//*  range mat or query
    int[][] query = new int[4][2];
     Scanner sc = new Scanner(System.in);
        for(int i = 0; i < query.length; i++){
            for(int j = 0; j < query[0].length; j++){
                query[i][j] = sc.nextInt();
            }
        }
        printMat(query);

        ArrayList<Integer> result = queryRangeSum(arr, query);

        System.out.println(result);

        sc.close();

    }

//* query rage sum
public static ArrayList<Integer> queryRangeSum(int[] arr, int[][] mat){
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i = 0; i < mat.length; i++){
        int L = mat[i][0];
        int R = mat[i][1];
        if( L == 0){
            ans.add(arr[R]);
        }else{
            ans.add(arr[R] - arr[L-1]);
        }   
    }
    return ans;
}


//*  print mat
    public static void printMat(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();

        }
    }
    
}

// query based range sum
