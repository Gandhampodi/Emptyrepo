package Collection;
import java.util.*;

public class Map2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");

       hm.remove(1);
       System.out.println(hm);
       System.out.println(hm.size());



    }
}
