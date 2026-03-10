import java.util.Arrays;

public class NearestSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4,6,10,11,7,8,3,5};
        int[] newArr = solve(arr);
        System.out.println(Arrays.toString(newArr));

        
    }
    public static int[] solve(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = -1;

        for(int i = 1; i < n; i++){
            ans[i] = -1;
            for(int j = i - 1; j >= 0; j--){
                if(arr[j] < arr[i]){
                    ans[i] = j;
                    break;
                }
            }
        }
        return ans;
    }
    
}

/*
given an integer array find nearest smaller element index on left
*/
