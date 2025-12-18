public class FrequencyOfElement{
public static void main(String[] args) {
    int[] arr = {2,5,4,6,5,2,5,6,8,9,5};
    System.out.println(findFrequency(arr, 2));
    
}

public static int findFrequency(int[] arr, int k){
    int n = arr.length;
    int count = 0;
    for(int i = 0; i < n; i++){
        if(arr[i] == k){
            count++;
        }
    }
    return count;
}

}