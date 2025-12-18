public class FrequencyOrElementQuery {
    public static void main(String[] args) {
        
    }
    
}

/*
* Problem Description

* SCALER organizes a series of contests aimed at helping learners enhance their coding skills. Each learner can participate in multiple contests, and their participation is represented by integers in an array. The goal is to identify how frequently each learner has participated in these contests. This information will help SCALER determine which learners are participating the least, allowing them to provide targeted support and encouragement.


* Given an array A that represents the participants of various contests, where each integer corresponds to a specific learner, and an array B containing the learners for whom you want to check participation frequency, your task is to find the frequency of each learner from array B in the array A and return a list containing all these frequencies

Example Input

Input 1:
A = [1, 2, 1, 1]
B = [1, 2]
Input 2:
A = [2, 5, 9, 2, 8]
B = [3, 2]


Example Output

Output 1:
[3, 1]
Output 2:
[0, 2]

public class Solution {
    public int[] solve(int[] A, int[] B) {
        int n = A.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(hm.containsKey(A[i])){
                int freq = hm.get(A[i]);
                hm.put(A[i], freq + 1);
            }else{
                hm.put(A[i], 1);
            }
        }

       int[] ans = new int[B.length];
      
        // Fetch frequencies manually (Java 7 compatible)
        for (int i = 0; i < B.length; i++) {
            if (hm.containsKey(B[i])) {
                ans[i] = hm.get(B[i]);
            } else {
                ans[i] = 0;
            }
        }
        
        return ans;
    }
}

*/