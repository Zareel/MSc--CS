public class PrintNtoOne {

    public static void main(String[] args) {
        int n = 10;
        decrement(n);
    }
    public static void decrement(int n){
        if(n == 0) return;
        System.out.println(n);
        decrement(n-1);

    }
}