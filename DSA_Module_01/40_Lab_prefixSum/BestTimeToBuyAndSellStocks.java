public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] A = {3,5,7,9,2,4,3,8,6};
        System.out.println(maxProfit(A));
     
        
  
    }

    public static int maxProfit(int[] A){
           int n = A.length;
        int min = A[0];
        int maxProfit = 0;

        for(int i = 1; i < n; i++){
            if(A[i] < min){
                min = A[i];
            }
            maxProfit = Math.max(maxProfit, A[i]- min);

        }
        return maxProfit;

    }
    
}

/*
Say you hav an array A for which ith element is the price of a given stock on day i.
if you were permitted to complete at most one transaction that means buy one and sell one share of the stock design an algorithm to find the maximum profit 
return the maximu possible profit

bruit force idea
consider every element as buyint point and inorder to find selling point, we need to consider max of all elements on its right

*/
