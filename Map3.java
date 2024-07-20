package Collection;
import java.util.*;

public class Map3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // creation of map
        HashMap<Integer, String> hm = new HashMap<>(); // hashmap,treemap, hashtable,
        hm.put(1,"hyderbad");     // linkedhashmap
        hm.put(2,"chennai");
        hm.put(3,"Delhi");
       System.out.println( hm.get(1));
       System.out.println(hm.containsKey(2));
       System.out.println(hm.containsValue("USA"));
        System.out.println(hm);
        hm.put(3,"Bangolre");// update
        hm.putIfAbsent(3,"delhi");
        hm.replace(1,"sai");
        System.out.println(hm);
    }
}
