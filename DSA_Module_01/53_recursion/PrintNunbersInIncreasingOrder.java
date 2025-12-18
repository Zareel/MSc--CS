public class PrintNunbersInIncreasingOrder {

    public static void main(String[] args) {
        int n = 5;
        increase(n);
    }
    public static void increase(int n){
        if(n == 0) return;
        increase( n - 1);
        System.out.println(n);
    }
}


/*
public class Solution {
    public void solve(int A) {
     increase(A);
        System.out.println();
    }
    public static void increase(int N){
        if(N == 0) return;
        increase(N - 1);
        System.out.print(N + " ");
    }
}
*/