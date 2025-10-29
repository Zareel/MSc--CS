public class GoodPair {
    public static void main(String[] args) {
        int[] A = {6,9,4,7,2};
        int B = 5;
        System.out.println(goodPair(A, B));
    }
    public static int goodPair(int[] A, int B){
        int n = A.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(A[i] + A[j] == B){
                    return 1;
                }
            }

        }
        return 0;
    }
    
}

/*
 * Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
 */
