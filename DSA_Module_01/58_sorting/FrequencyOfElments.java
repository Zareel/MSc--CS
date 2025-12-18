import java.util.ArrayList;

public class FrequencyOfElments {
    public static void main(String[] args) {
        int[] arr = {5,6,5,4,8,5,6,2,4,4,4,5,8};
    }

    public static ArrayList<Integer> findFrequency(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                result.get(i) = count;
            }
        }
    }
    
}
