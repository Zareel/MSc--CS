public class SumOfAllSubArrSum {
    public static void main(String[] args) {
        int[] A = {3,4,2};
        int n = A.length;
        int total = 0;
        for(int s = 0; s < n; s++){
            int sum = 0;
            for(int e = s; e < n; e++){
                sum += A[e];
                //System.out.print(sum + " ");
                total += sum;
            }
        }
        System.out.println(total);
    }
    
}
