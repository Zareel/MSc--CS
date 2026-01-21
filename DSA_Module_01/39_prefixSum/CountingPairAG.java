public class CountingPairAG {
    public static void main(String[] args) {

        char[] A = {'a', 'p', 'g', 'g', 'a','d'};
        // optimized code
        int n = A.length;
        int count = 0;
        int ans = 0;

        for(int i = 0; i < n; i++){
            if(A[i] == 'a'){
                count++;
            }else if(A[i] == 'g'){
                ans += count;
            }
        }
        System.out.println(ans);

        /*
        * Bruit fource
              int count = 0;
        for(int i = 0; i < n; i++){
        if(i == 'a'){
            for(int j = i + 1; j < n; j++){
                if(A[j] == 'g'){
                    count++;
                }
            }
        }
        System.out.println(count);
        */
      
        
    }
    
}

/*
Given a character array of length N. calculate number of paris indices (i, j) such that i < j && ch[i] == 'a' && ch[j] == 'g'
i != j, all ch are in lowercase
*/