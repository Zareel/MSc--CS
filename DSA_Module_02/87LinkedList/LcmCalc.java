public class LcmCalc {
    public static void main(String[] args) {

        int a = 20; 
        int b = 33;
        System.out.println(findLCM(a, b));
        
    }
    public static int findLCM(int a, int b){

        return a*b / findGCD(a,b);

    }

    public static int findGCD(int a, int b){
        int gcd = 1;
        for(int i = Math.min(a, b); i >= 1; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;

            }
        }
        return gcd;
    }
}
