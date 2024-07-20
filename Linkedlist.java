package Collection;
import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("A");
        array.add("B");
        LinkedList<String> list = new LinkedList<>();
        list.add("Y1");
        list.add("Y2");
        list.add(1,"Y");
        list.addAll(array);
        list.remove(0);
        System.out.println(list.get(0));
        System.out.println(list.contains("Y"));
        list.set(0,"s3");
        list.removeAll(array);
       // list.clear();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf(2));
        System.out.println(list);


    }
}
