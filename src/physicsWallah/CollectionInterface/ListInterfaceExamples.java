package physicsWallah.CollectionInterface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListInterfaceExamples {
    static void ArrayListExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);  // 1, 2, 3
        System.out.println(l.get(1));  // 0-based indexing => 2
        l.set(1,10);  // modify at index i
        System.out.println(l);
        System.out.println(l.contains(10)); // boolean output => true
    }
    static void LinkedListExamples(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        System.out.println(l);
        l.poll();
        System.out.println(l);
        l.add(2);
        l.add(3);
        System.out.println(l);  // 1, 2, 3
        System.out.println(l.get(1));  // 0-based indexing => 2
        l.set(1,10);  // modify at index i
        System.out.println(l);
        System.out.println(l.contains(10)); // boolean output => true
    }
    static void StackExamples(){
        Stack<Integer> l = new Stack<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.push(4);
        System.out.println(l);  // 1, 2, 3
        System.out.println(l.get(1));  // 0-based indexing => 2
        l.set(1,10);  // modify at index i
        System.out.println(l);
        System.out.println(l.contains(10)); // boolean output => true
    }
    public static void main(String[] args) {
//        ArrayListExamples();
        LinkedListExamples();
//        StackExamples();
    }
}
