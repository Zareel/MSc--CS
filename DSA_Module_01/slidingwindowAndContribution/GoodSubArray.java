public class GoodSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printSubarray(arr);
        
    }
    public static void printSubarray(int[] arr){
        int n = arr.length;
        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                for(int i = s; i <= e; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
               
            }
        }
    }
    
}

/*
given array of integers A. A subarray of an array is said to be good if it fullfills any one of the criteria
1. length of the subarray is be even and sum of all the elements of the subarray must be less than B
2. length of the subarray is be odd and the sum of all the elements of the subarray must be greater than B

*/ 