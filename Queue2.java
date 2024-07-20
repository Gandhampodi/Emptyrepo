package Collection;
import java.util.*;

public class Queue2 {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("Banana");
        queue.addFirst("Cherry");
        queue.addLast("Mango");
        queue.offer("kiwi");
        queue.offerFirst("pear");
        queue.offerLast("Apple");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.pollFirst());

        System.out.println(queue);
        System.out.println(queue.pollLast());
        System.out.println(queue);    // here insertion order working
        System.out.println(queue.pollFirst());
        System.out.println(queue);
        System.out.println(queue.size());
    }

}
