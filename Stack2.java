package Collection;
import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Java");
        books.push("Python");
       // books.push("NULL");
        //books.push("Null");
        books.push("JavaScript");
        books.push("PHP");
        System.out.println(books.get(0));
        System.out.println(books.peek());
        System.out.println(books);
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.indexOf("PHP"));
        System.out.println(books.search("PHP"));

    }
}
