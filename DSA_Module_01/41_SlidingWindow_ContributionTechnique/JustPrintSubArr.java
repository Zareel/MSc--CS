public class JustPrintSubArr {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int n = A.length;
        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                for(int i = s; i <= e; i++){
                    System.out.print(A[i] + " ");
                }
            }
        }
    }
    
}
