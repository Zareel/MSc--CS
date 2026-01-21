public class PaintersPartition {
    public static void main(String[] args) {
        int[] A = {3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};
        System.out.println(paitersBoard(A, 4));
    }
    public static int paitersBoard(int[] A, int k){
        int n = A.length;
        int max = A[0];
        int sum = A[0];
        for(int i = 1; i < n; i++){
            max = Math.max(max, A[i]);
            sum = sum + A[i];

        }
        int lo = max;
        int hi = sum;
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(checkPossible(A, mid, k)){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
    public static boolean checkPossible(int[] A, int time, int totalPainters){
        int painters = 1;
        int currSum = 0;
        int n = A.length;
        for(int i = 0; i < n; i++){
            currSum+=A[i];
            if(currSum > time){
                painters++;
            }
        }
        return (painters <= totalPainters);
    }
    
}
