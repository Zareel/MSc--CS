public class CountOfSubArrays{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(countSubArr(arr));

    }
    public static int countSubArr(int[] A){
        int N = A.length;
        int count = N * (N + 1) / 2;
        return count;
    }

}