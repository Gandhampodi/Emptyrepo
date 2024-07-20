package Collection;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> books= new Stack<>();
        books.add("RED"); // push or add are both are same
        books.add("BLUE");
        books.add("GREEN");
        books.add(0,"PURPLE");
        System.out.println(books);
        System.out.println(books.size());
        System.out.println(books.capacity());
       System.out.println( books.remove(2));
       System.out.println(books);
       System.out.println(books.set(0,"YELLOW"));
       System.out.println(books);
       System.out.println(books.contains("YELLOW"));
       System.out.println(books.lastElement());
       System.out.println(books.lastIndexOf("YELLOW"));
       System.out.println(books.peek());  // peek it shows the last element
       System.out.println(books);
       System.out.println(books.pop());  // it will remove from the stack
       System.out.println(books);
       System.out.println(books.search("Red"));

       System.out.println(books);

    }
}
