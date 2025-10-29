public class evenNumInGivenRange {
    public static void main(String[] args) {
        int[] arr = {2,4,3,7,9,8,6,3,4,9};
        int ans = countOfEvenNumInGivenRange(arr, 6, 8);
        System.out.println(ans);

    }
    public static int countOfEvenNumInGivenRange(int[] arr, int L, int R){
        int count = 0;
        for(int i = L; i <= R; i++){
            if(arr[i] % 2 == 0){
                count++;
            } 
        }
        return count;
    }
}
