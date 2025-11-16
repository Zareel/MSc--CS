import java.util.HashSet;

public class ColorfulNumber {
    public static void main(String[] args) {
        int A = 3245;
        System.out.println(colorfulNum(A));
     
    }
    public static int colorfulNum(int A){
        // convert number to string to access the individual digits
           String str = String.valueOf(A);
        //System.out.println(str);
        HashSet<Integer> hs = new HashSet<>();
        // nested loop to get all the contiguous subsequences
        for(int i = 0; i < str.length(); i++){
            int product = 1;
            for(int j = i; j < str.length(); j++){
                // conpute the product of each sequence 
                product *= (str.charAt(j) - '0');
                // if products repeates return 0;
                if(hs.contains(product)){
                    return 0;
                }
                // if not repetition add the product to hashset
                hs.add(product);
            }
        }
        return 1;

    }
}

/*
 * Given an number A. find if it is COLORFUL number or not. if number A is colorful number return 1 else return 0;
  the number 3245 can be broken into sequences like 3, 32, 324, 3245, 2, 24, 245, 4, 45, 5. this number is a colorful number since the pruduct of every consecutive sequence of digits is different
 */