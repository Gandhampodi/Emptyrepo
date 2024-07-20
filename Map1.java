package Collection;
import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("a", "b");
        hm.put("c", "d");
        hm.put("e", "f");
        hm.put("g", "h");
        hm.put("i", "j");
        hm.clear();
        System.out.println(hm);
    }

}
