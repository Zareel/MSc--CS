public class GP {

    public static void main(String[] args) {
        // sum of first five terms in GP
        int[] geometricProgression = {2,4,8,16,32};
        System.out.println(sumOfNthTermInGP(geometricProgression));

    }
    public static int sumOfNthTermInGP(int[] arr){
        int a = arr[0];
        int r = arr[1] / arr[0];
        int N = arr.length;
        double gpSum = a*(Math.pow(r,N) -1)/(r-1);
        return (int)gpSum;

    }
}