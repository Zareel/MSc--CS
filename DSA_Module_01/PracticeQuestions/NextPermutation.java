import java.util.Arrays;

public class NextPermutation{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
       
        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                swap(arr, i, i+1);
            }
        }

        System.out.println(Arrays.toString(arr));

     
}
public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    
}

public static void reverse(int[] arr, int start, int end){
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        
    }
}

}






/*
Problem Description

Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.



If such arrangement is not possible, it must be rearranged as the lowest possible order, i.e., sorted in ascending order.

NOTE:



The replacement must be in-place, do not allocate extra memory.
DO NOT USE LIBRARY FUNCTION FOR NEXT PERMUTATION. Use of Library functions will disqualify your submission retroactively and will give you penalty points.
*/