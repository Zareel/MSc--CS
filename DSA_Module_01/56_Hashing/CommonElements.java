public class CommonElements {
    public static void main(String[] args) {
        
    }
    
}

/*
* Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

Example Input

Input 1:

 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:

 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]


Example Output

Output 1:

 [1, 2, 2]
Output 2:

 [2, 10]
---------------------------------------------------
 public class Solution {
    public int[] solve(int[] A, int[] B) {
        int n = A.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Build frequency map for A
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(A[i])) {
                hm.put(A[i], hm.get(A[i]) + 1);
            } else {
                hm.put(A[i], 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        // Find common elements using multiset logic
        for (int i = 0; i < B.length; i++) {
            if (hm.containsKey(B[i]) && hm.get(B[i]) > 0) {
                list.add(B[i]);
                hm.put(B[i], hm.get(B[i]) - 1);
            }
        }

        // Convert list to array
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
*/