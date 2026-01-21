public class ClosestMinMax {
    public static void main(String[] args) {
        int[] A = {3,1,4,2,5,3,2,4,1};
        System.out.println(findClosestMinMax(A));
    
    }
    public static int findClosestMinMax(int[] A){
      int min = A[0], max = A[0];
        int n = A.length;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        int lastMin = -1;
        int lastMax = -1;
        int ans = n;

        // Step 2: Traverse and update answer
        for (int i = 0; i < n; i++) {
            if (A[i] == min) lastMin = i;
            if (A[i] == max) lastMax = i;

            if (lastMin != -1 && lastMax != -1) {
                int len = Math.abs(lastMax - lastMin) + 1;
                ans = Math.min(ans, len);
            }
        }

        return ans;
        
    }
}
