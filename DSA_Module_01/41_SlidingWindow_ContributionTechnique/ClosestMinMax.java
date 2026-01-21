public class ClosestMinMax {
    public static void main(String[] args) {
        int[] A = {2,1,6,3,6,9};
        System.out.println(findClosestMinMax(A));

        
    }
    public static int findClosestMinMax(int[] A){
        int n = A.length;
        // find the min and the max
        int min = A[0];
        int max = A[0];
        for(int i = 0; i < n; i++){
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        
        if(min == max) return 1;

        int lastMin = -1;
        int lastMax = -1;
        int ans = n;

        for(int i = 0; i < n; i++){
            if(A[i] == min) lastMin = i;
            if(A[i] == max) lastMax = i;
            if(lastMin != -1 && lastMax != -1){
                int len = Math.abs(lastMax - lastMin) + 1;
                ans = Math.min(ans, len);
            } 
        }
        return ans;
    
    }
    
    
}
/*
* Given an array A. find the size of the smallest subArray such that it contains at least one occurrence of the maximum value of the array and atleast one occurence of the minimum value of the array
*/