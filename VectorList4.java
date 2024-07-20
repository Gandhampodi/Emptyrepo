package Collection;
import java.util.*;

public class VectorList4 {
    public static void main(String[] args) {
        Object[] arr=new Object[]{1,2,4,5,6,7,8,9,10};
        Vector v = new Vector(Arrays.asList(arr));
      //  v.add("Ayyappa");
       // v.add("jai");
       // v.add(1,"yogi");
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v);
    }
}
