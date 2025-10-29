public class AP {
    public static void main(String[] args) {
        // sum of first 5 terms in AP
        int[] arithmeticProgression = {5,9,13,17,21};
        System.out.println(sumOfNters(arithmeticProgression));
    }
    public static int sumOfNters(int[] arr){
        int N = arr.length;
        int d = arr[1] - arr[0];
        int a = arr[0];
        System.out.println(N);
        System.out.println(a);
        System.out.println(d);
        int apSum = N*((2 * a) + ((N-1)*d))/2;
        return apSum;
    }
    
}
