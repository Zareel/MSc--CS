public class PrimeCount {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(countPrime(n));
    }
    public static int countPrime(int n){
        int count = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
        
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
