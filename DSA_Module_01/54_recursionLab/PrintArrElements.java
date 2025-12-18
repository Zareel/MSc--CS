public class PrintArrElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printArr(arr, 0);
        System.out.println();
    }
    public static void printArr(int[] arr, int index){

    
        if(index == arr.length) return;
        System.out.print(arr[index] + " ");
        printArr(arr, index + 1);

    }
    
}


/*
public class Solution {
    public void PrintArray(int[] A) {
        
      solve(A, 0);
      System.out.println();

    }
    public static void solve(int[] A, int index){
        if(index == A.length) return;
        System.out.print(A[index] + " ");
        solve(A, index+1);
    }
}

*/
