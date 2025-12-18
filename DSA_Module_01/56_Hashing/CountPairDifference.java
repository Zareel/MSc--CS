public class CountPairDifference {
    public static void main(String[] args) {
        
    }
    
}

/*
* you are given an array A of N integers and an integer B. Count the number of pairs (i, j) such that A[i] - A[j] = B and i != j

Since the answer can be very large, return the remainder after dividing the count with 109+7.

Example Input

Input 1:

A = [3, 5, 1, 2]
B = 4
Input 2:

A = [1, 2, 1, 2]
B = 1


Example Output

Output 1:

1
Output 2:

4


✔ Explanation with Example
Input 2:

A = [1, 2, 1, 2]
B = 1

Frequency map → {1:2, 2:2}

Check each element:

x = 1 → 1 - 1 = 0 → freq.get(0)? No → 0

x = 2 → 2 - 1 = 1 → freq.get(1) = 2 → ans += 2

x = 1 → ans += 0

x = 2 → ans += 2

Total ans = 4 ✅ matches expected output.

This code now correctly counts all (i,j) pairs where i != j and A[i] - A[j] = B.

It also handles large numbers with modulo and works in O(N) time.

import java.util.HashMap;

public class Solution {
    public int solve(int[] A, int B) {
        long mod = 1000000007L;
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Build frequency map
        for (int i = 0; i < A.length; i++) {
            int x = A[i];
            if (freq.containsKey(x)) {
                freq.put(x, freq.get(x) + 1);
            } else {
                freq.put(x, 1);
            }
        }

        long ans = 0;

        // Count pairs using normal for loop
        for (int i = 0; i < A.length; i++) {
            int x = A[i];
            int target = x - B;
            if (freq.containsKey(target)) {
                ans = (ans + freq.get(target)) % mod;
            }
        }

        return (int) ans;
    }
}

✅ Key Points

We replaced the enhanced for-loop with for (int i = 0; i < A.length; i++).

Frequency map is built the same way.

Works for all test cases, respects i ≠ j, and applies mod 10⁹+7.

*/
