import java.util.HashMap;

public class Frequency {
        public static void main(String[] args) {
            int[] arr = {1,5,6,9,7,4,5,6,8,4,1};
            findFrequency(arr);
            
            
        }
        public static void findFrequency(int[] arr){
            HashMap<Integer,  Integer> map = new HashMap<>();
            for(int i = 0; i < arr.length; i++){
                int num = arr[i];
                if(map.containsKey(num)){
                    map.put(num, map.get(num) + 1);
                }else{
                    map.put(num, 1);
                }
            }
            System.out.println(map);
        }
}
