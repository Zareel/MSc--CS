public class FindNthMagicNumber{
    public static void main(String[] args[]){
        int num = 8;

    }
    public static int nthMagicNumber(int num){
        int ans = 0; 
        int power = 5;
        while(num > 0){
            int r = num % 2;
            num = num / 2;
            ans+= r * power;
            power *= 5;
        }
        return ans;
    }
}

/*
 * Given an integer A. Find and return the Nth magic number. A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique power of 5.
 */