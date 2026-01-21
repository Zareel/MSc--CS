public class SurareRoot {
    public static void main(String[] args) {
        int A = 10;
        ;
        System.out.println(searchSqrt(A));
    }
    public static int searchSqrt(int A){
        if(A == 0 || A == 1) return A;
        int lo = 0; 
        int hi = A;
        int ans = 0;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(mid * mid == A){
                return mid;
            }else if(mid * mid < A){
                   ans = mid; 
            lo = mid+1;
            }else{
            hi = mid-1;
        }
         
        }
        return ans;
    }
    
}
