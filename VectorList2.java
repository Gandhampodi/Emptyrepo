package Collection;
import java.util.*;

public class VectorList2 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Ayyappa");
        v.add("jai");
        v.add(1,"yogi");


        Vector v2 = new Vector();
        v2.add("jashu");
        v2.add("sai");
        v2.add("nani");
        System.out.println(v);

        v.addAll(0,v2);
      //  for(int i=0; i<v2.size(); i++){
       //     v.add(v2.get(i));

     //   }
     System.out.println(v.get(0));
     v.remove(0);  // v.remove("sai"); // v.removeAll(v2);// v.clear();

     System.out.println(v);
    }
}
