public class SumOfMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {2,3,6,5,4,7};
        System.out.println(sumOfMaxAndMin(arr));
    }
    public static int sumOfMaxAndMin(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        int sum = max + min;
        return sum;
    }
}
