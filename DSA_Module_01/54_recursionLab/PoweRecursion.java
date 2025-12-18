public class PoweRecursion{
    public static void main(String[] args){
        int A = 5;
        int B = 3;
        System.out.println(power(A, B));

    }
    public static long power(int A, int B){
        if(B == 0) return 1;
        long half = power(A, B/2);
        if(half % 2== 0){
            return half*half;
        }else{
            return half * half * A;
        }
    }
}