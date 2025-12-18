# Lab Session On Hashing

### Q1. find the length of longest substring without repeating characters

```java
String str = "abcabcbb"
```

### Q2. find first non repeating element

### Q3. Longest Substring Without Repeat.
### Problem Description

Determine the "GOOD"ness of a given string A, where the "GOOD"ness is defined by the length of the longest substring that contains no repeating characters. The greater the length of this unique-character substring, the higher the "GOOD"ness of the string.

Your task is to return an integer representing the "GOOD"ness of string A.

Note: The solution should be achieved in O(N) time complexity, where N is the length of the string.


Problem Constraints

1 <= size(A) <= 106

String consists of lowerCase,upperCase characters and digits are also present in the string A.



Input Format

Single Argument representing string A.



Output Format

Return an integer denoting the maximum possible length of substring without repeating characters.



Example Input

Input 1:

 A = "abcabcbb"
Input 2:

 A = "AaaA"


Example Output

Output 1:

 3
Output 2:

 2


Example Explanation

Explanation 1:

 Substring "abc" is the longest substring without repeating characters in string A.
Explanation 2:

 Substring "Aa" or "aA" is the longest substring without repeating characters in string A.

 ```java
public class Solution {
    public int lengthOfLongestSubstring(String A) {
        int n = A.length();
        int s = 0;
        int e = 0;
        int maxLen = 0;
        HashSet<Character> hs = new HashSet<>();
        while(e < n){
            while(hs.contains(A.charAt(e))){
                // remove from the starting
                hs.remove(A.charAt(s));
                s++;
            }
            hs.add(A.charAt(e));
            maxLen = Math.max(maxLen, e-s+1);
            e++;
        }
        return maxLen;

    }
}
 ```

### Q4.  Sub-array with 0 sum
### Problem Description

Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.

Problem Constraints

1 <= |A| <= 100000

-10^9 <= A[i] <= 10^9

Input Format

The only argument given is the integer array A.

Output Format

Return whether the given array contains a subarray with a sum equal to 0.

Example Input

Input 1:

 A = [1, 2, 3, 4, 5]

Input 2:

 A = [4, -1, 1]


Example Output

Output 1:

 0
Output 2:

 1


Example Explanation

Explanation 1:

 No subarray has sum 0.
Explanation 2:

 The subarray [-1, 1] has sum 0.