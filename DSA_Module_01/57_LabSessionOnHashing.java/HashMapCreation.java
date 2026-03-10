import java.util.HashMap;

public class HashMapCreation {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("Orange", 56.5);
        map.put("Grapes", 156.5);
        map.put("Apple", 256.5);
        map.put("coconut", 60.3);

        map.remove("Grapes");
       System.out.println( map.get("Apple"));
       System.out.println(map.containsKey("Orange"));

       if(map.containsKey("Applew")){
        System.out.println(map.get("Apple"));
       }else{
        System.out.println("key not found");
       }

       System.out.println(map.containsValue(100.0));
       System.out.println(map.size());

        System.out.print(map);
    }
    
    
}
