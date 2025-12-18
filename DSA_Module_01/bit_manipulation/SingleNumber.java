public class SingleNumber {
    public static void main(String[] args) {
        
    }

    public static int[] findSingles(int[] A){
        int n = A.length;
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor = (xor ^ A[i]);
        }
        // xor of two unique number
        int idx = 0;
        while(xor > 0){
            // if the xor is set break
            if((xor & 1) == 1){
                break;
            }
            idx++;
            // other  wise right shift
            xor  = (xor >> 1);
        }
        int xorSet = 0;
        int xorUnSet = 0;
        for(int i = 0; i < n; i++){
            if((A[i] & (1 << idx)) == 0){
                xorUnSet = xorUnSet ^ A[i];
            }else{
                xorSet = xorSet ^ A[i];
            }
        }
        int[] ans = new int[2];
        if(xorSet < xorUnSet){
            ans[0] = xorSet;
            ans[1] = xorUnSet;
        }else{
             ans[0] = xorUnSet;
            ans[1] = xorSet;

        }
        return ans;
    }
    
}
/*
    Given an array of positive integers, two integers appear only once and all the other interger appear twice. fint the two integers that appear only once
*/
