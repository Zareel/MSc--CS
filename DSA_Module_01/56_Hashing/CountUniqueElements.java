public class CountUniqueElements {
    public static void main(String[] args) {
        
    }
    
}

/*
* you are given an Array of N integers, return the count of elements with frequency 1 in the given array

Example Input

Input 1:
A = [3, 4, 3, 6, 6]
Input 2:
A = [3, 3, 3, 9, 0, 1, 0]


Example Output

Output 1:
1
Output 2:
2
------------------------------------------------------------------------

public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;

        for(int i = 0; i < n; i++){
           if(hm.containsKey(A[i])){
            int freq = hm.get(A[i]);
            hm.put(A[i], freq + 1);
           }else{
               hm.put(A[i], 1);
           }

        }
     Integer[] keys = hm.keySet().toArray(new Integer[0]);

for (int i = 0; i < keys.length; i++) {
    int key = keys[i];
    if (hm.get(key) == 1) {
        ans++;
    }
}
return ans;
    }
}

*/
