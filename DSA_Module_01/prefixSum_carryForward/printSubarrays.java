public class printSubarrays {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3,-1,6,9,8,12};
        // printSubarray(arr, 2, 7);
        // System.out.println();
        // printSubArr(arr,1 , 6);
        printAllSubArr(arr);
       
     
    }
// you are given start index and end index. print subarray
    public static void printSubarray(int[] arr, int s, int e){
        for(int i = s; i <= e; i++){
            System.out.print(arr[i] + " ");
        }

    }
// you are given starting index and length. print the subarray

public static void printSubArr(int[] arr, int s, int len){
    int e = s + len-1;

    for(int i = s; i <= e; i++){
        System.out.print(arr[i] + " ");
    }
}

// print all sub arrays
public static void printAllSubArr(int[] arr){
    int n = arr.length;
    for(int s = 0; s < n; s++){
        for(int e = s; e <  n; e++){
            // print subarrays
            for(int i = s; i <= e; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// print arr 
public static void printArr(int[] arr){
  int n = arr.length;
  for(int i = 0; i< n; i++){
    System.out.print(arr[i] + " ");
  }

}

    
    
}

/*
        int n = A.length();
        long gCount = 0;
        long result = 0;

        for (int i = n - 1; i >= 0; i--) {
            char c = A.charAt(i);
            if (c == 'G') {
                gCount++;
            } else if (c == 'A') {
                result += gCount;
            }
        }

        return result;
 */