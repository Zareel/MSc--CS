public class AllSubArraySum {
    public static void main(String[] args) {
        int[] A = {3,4,2};
        int n = A.length;
        /* 
        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                int sum = 0;
                for(int i = s; i <= e; i++){
                    sum += A[i];
                }
                System.out.print(sum + " ");
            }
        }
        */

        // optimized way

      

        for(int s = 0; s < n; s++){
            int sum = 0;
            for(int e = s; e < n; e++){
                sum += A[e];
                System.out.print(sum + " ");
                
            }
           
        }
       

    }
}
