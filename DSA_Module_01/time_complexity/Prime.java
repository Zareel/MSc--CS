
public class Prime {
    public static void main(String[] args){
        int A = 11;
        System.out.println(isPrime(A));
    }
    public static boolean isPrime(int A){
        int n = (int)Math.sqrt(A);
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(A% i ==0){
                if(i == A/i){
                    count++;
                }else{
                    count+=2;
                }
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }

   
    
}
