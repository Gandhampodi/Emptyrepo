package Collection;
import java.util.HashSet;
public class Set {
    public static void main(String[] args) {
        // hashset--> HashMap->array of nodes(keys,valus)
        // linked hashset,treeset,hashedset
        HashSet<Integer> hs= new HashSet<>();
        hs.add(10);
        hs.add(2);    // hashset refercence the only hashmap keys only
        hs.add(30);   // tree set are by default take the ascending order
        hs.add(4);   // set doesnot allow the duplicate value
        hs.add(5);
        hs.add(null);
        System.out.println(hs);
        System.out.println(hs.remove(85));
        System.out.println(hs.contains(30));
        for(Integer i : hs){
            System.out.println(i);
        }

    }
}
