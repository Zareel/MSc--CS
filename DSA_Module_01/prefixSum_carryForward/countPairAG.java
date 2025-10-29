public class countPairAG {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'f', 'g', 'a', 'g','g', 'd'};
        System.out.println(agPair(arr));
        System.out.println(optimisedCodeAGpairs(arr));
        
    }

    public static int agPair(char[] arr){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 'a'){
                for(int j = i+1; j < n; j++){
                    if(arr[j] == 'g'){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // optimized way
    public static int optimisedCodeAGpairs(char[] arr){
        int n = arr.length;
        int count = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 'a'){
                count++;
            }else if(arr[i] == 'g'){
                ans += count;
            }
        }
        return ans;
    }
    
}

//? given an character array of length N. Calculate number of pairs indices (i, j) such that i < j && ch[i] == 'a' &&  ch[j] == g. all characters of array are lowercase
