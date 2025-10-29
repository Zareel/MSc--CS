public class MaxOfAnArray {
    public static void main(String[] args) {
        int[] arr = {2,5,-9,4,2,-5,12,-41,6};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
               max =  Math.max(max, arr[i]);
            }
        }
        System.out.println(max);
    }
    
}
