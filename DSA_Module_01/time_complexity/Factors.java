
public class Factors {
    public static void main(String[] args){
        int A = 36;
        System.out.println(factors(A));

    }
      public static int factors(int A){
        int n =(int)Math.sqrt(A);
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(A % i == 0){
                if(i == A/i){
                    count++;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    
}
}
