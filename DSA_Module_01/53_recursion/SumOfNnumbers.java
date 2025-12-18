public class SumOfNnumbers{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findSumOfNnumbers(n));
    }
    public static int findSumOfNnumbers(int n){
        if(n == 1) return 1;
        return findSumOfNnumbers(n-1)+n;
    }
}