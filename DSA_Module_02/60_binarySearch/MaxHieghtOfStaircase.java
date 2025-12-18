public class MaxHieghtOfStaircase {
    public static void main(String[] args) {
      int A = 17;
      System.out.println(findHeightOfStaircase(A));
        
    }
    public static int findHeightOfStaircase(int A){
        int l = 0;
        int h = A;
        int ans = 0;
        while(l <= h){
            int mid = (l+h)/2;
            long requiredBlocks = (long) mid * (mid + 1) / 2;
            if(requiredBlocks <= A){
                ans = mid;
                l = mid+1;

            }else{
                h = mid-1;
            }
        }
        return ans;

    }
    
}

/*
* given an integer A, representing the number of square blocks. the height of each square block is 1. the task is to create a staircase of max height using these blocks. the first stair would requare only one blocks and so on. find and return the maximum height of the starecase.
*/
