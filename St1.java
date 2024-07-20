package Collection;
import java.util.TreeSet;

public class St1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println(ts.subSet(2,6));
        System.out.println(ts.descendingSet());

        System.out.println(ts);    // set is store the unique elements
    }
}
