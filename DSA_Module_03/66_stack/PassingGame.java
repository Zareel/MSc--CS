import java.util.ArrayList;

public class PassingGame {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
   System.out.println(printSubarr(arr));
        
    }
    public static ArrayList<ArrayList<Integer>> printSubarr(int[] arr){
        int n = arr.length;
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        
        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                ArrayList<Integer> ans = new ArrayList<>();
                for(int i = s; i <= e; i++){
                    ans.add(arr[i]);
                      
                }
               al.add(ans);
             
            }
   
        }
        return al;
    }
    
}

/*
 * There is a football event going on in your city. In this event, you are given A passes and players having ids between 1 and 106.


Initially, some player with a given id had the ball in his possession. You have to make a program to display the id of the player who possessed the ball after exactly A passes.

There are two kinds of passes:

1) ID

2) 0

For the first kind of pass, the player in possession of the ball passes the ball "forward" to the player with id = ID.

For the second kind of pass, the player in possession of the ball passes the ball back to the player who had forwarded the ball to him.

In the second kind of pass "0" just means Back Pass.

Return the ID of the player who currently possesses the ball.
 */
