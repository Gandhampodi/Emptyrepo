package Collection;
import java.util.*;

public class Queue {
    public static void main(String[] args) { // fifo
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.offer(8);//Addition  -offer,add  // retrieval-peek ,// removal-poll ,remove
    pq.add(2);
    pq.offer(7);
    pq.offer(5);//head
        pq.offer(8);
       // pq.offer(null);
    System.out.println(pq);
    System.out.println(pq.peek());  // it only do the head position
  System.out.println(pq.poll());
  System.out.println(pq);
  System.out.println(pq.contains(5));   // it working single ended

    }
}
