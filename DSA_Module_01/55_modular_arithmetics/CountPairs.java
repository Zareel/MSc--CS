public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {5,6,9,1, 5};
        System.err.println(countOfPairs(arr, 10));

    }
    public static int countOfPairs(int[] arr, int k){
        int n = arr.length;
        int count = 0;
        for(int i = 0;i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == k){
                    count++;
                }
            }
        }
        return count;
    }
    
}

// * count pairs such that arr[i] + arr[j] = k
