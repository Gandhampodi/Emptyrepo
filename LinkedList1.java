package Collection;
import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("D");
        list.add(null);
        System.out.println(list);

    }
}
/*
 what is the default vector capacity // 0
// what is the inital capacity  // 0
// Does it allow duplicate element // yes
// Does it allow the null value // yes
// does it maintain the insertion order// yes   insertion order means adding the data
// does it maintain the sorted order// no
// does it maintain the random access of elements  // yes
// is it synochonised //  when you are use the collection class
 // by the default the linked list is not synochonised
 //  what is it good at


 // insertion sort is always faster than selection sort
 */