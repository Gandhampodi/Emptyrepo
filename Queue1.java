package Collection;
import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
       ArrayDeque<String> queue = new ArrayDeque<>();
       queue.offer("a");
       queue.offer("b");
       queue.offer("c");

       System.out.println(queue);
       System.out.println(queue.peek());
       System.out.println(queue);
       System.out.println(queue.poll());
       System.out.println(queue);
       System.out.println(queue.size());
    }

}
//what is the default vector capacity // 11
// what is the inital capacity  //  11
// Does it allow duplicate element //  yes
// Does it allow the null value //  no
// does it maintain the insertion order// no
// does it maintain the sorted order// no
// does it maintain the random access of elements  // no
// is it synochonised // no  when you are use the collection class
// by the default the linked list is not synochonised
//  what is it good at