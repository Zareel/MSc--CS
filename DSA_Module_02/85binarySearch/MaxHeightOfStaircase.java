public class MaxHeightOfStaircase {
    public static void main(String[] args) {
        int A = 27;
        System.out.println(findNumOfBlocks(A));

    }
    public static int findNumOfBlocks(int A){
        int lo = 0;
        int hi = A;
        int ans = 0;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            int numOfBlocks = mid * (mid+ 1)/2;
           if(numOfBlocks <= A){
             ans = mid;
            lo = mid + 1;
           }else{
            hi = mid - 1;
           }

        }
        return ans;
    }

    
}
