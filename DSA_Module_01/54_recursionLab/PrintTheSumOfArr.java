public class PrintTheSumOfArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(findSum(arr, 0));
        
    }
    
    public static int findSum(int[] arr, int index){
        if(index == arr.length) return 0;
        return arr[index] + findSum(arr, index + 1);

    }
}
