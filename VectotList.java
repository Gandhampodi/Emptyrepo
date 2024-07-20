package Collection;
import java.util.*;
public class VectotList {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Ayyappa");
        v.add("jai");
        v.add(1,"yogi");
        v.add("y1");
        v.add("y2");
        v.add("y3");
        v.add("y4");
        v.add("y5");
        v.add("y6");
        v.add("y7");
        v.add("y8");

        v.add("Ayyappa");
        v.add("jai");
        v.add(1,"yogi");
        v.add("y1");
        v.add("y2");
        v.add("y3");
        v.add("y4");
        v.add("y5");
        v.add("y6");
        v.add("y7");
        System.out.println("Size: " + v.size());
        System.out.println("capacity: " + v.capacity());
    }

}
