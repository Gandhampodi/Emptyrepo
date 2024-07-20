package Collection;
import java.util.*;

public class Arraylist {
public static void main(String[] args) {
    Integer [] arr=new Integer[]{1,2,3,4,5,6,7,8,9};
  ArrayList <Integer> arraylist=new ArrayList<>(Arrays.asList(arr));
    arraylist.add(0);
    arraylist.add(5);
    arraylist.add(9);
    System.out.println(arraylist);
    System.out.println(arraylist.size());
    System.out.println(arraylist.get(0));
    System.out.println(arraylist.contains(5));
    System.out.println(arraylist.containsAll(arraylist));
    System.out.println(arraylist.isEmpty());
    System.out.println(arraylist.size());
    System.out.println(arraylist.lastIndexOf(9));
    System.out.println(arraylist.indexOf("9"));
    arraylist.remove("9");
    arraylist.removeAll(arraylist);



}
}
