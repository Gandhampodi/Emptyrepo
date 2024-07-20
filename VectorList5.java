package Collection;
import java.util.*;

public class VectorList5 {
    public static void main(String[] args) {
        Object [] arr=new Object[]{1,2,3,4,5};
        Vector<Integer> v = new Vector<>(); //The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods,classes, and interfaces.
        //       Using Generics, it is possible to create classes that work with different data types.
        //       An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
        v.add(1);
        v.add(null);
        v.add(null);
        v.add(12);
        v.add(null);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}
// what is the default vector capacity // 10
// what is the inital capacity  // 10
// Does it allow duplicate element // yes
// Does it allow the null value // yes
// does it maintain the insertion order// yes
// does it maintain the sorted order// no
// does it maintain the random access of elements  // yes
// is it synochonised //  yes
 //  what is it good at //  multi threading, data is increaseed exponentially