package physicsWallah.CollectionInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetInterfaceExamples {
    static void Hashset(){
        HashSet<Integer> h = new HashSet<>(); // all element are unique and unordered
        h.add(1);
        h.add(2);
        h.add(3);
        System.out.println(h); // 1 2 3
        h.add(1);
        h.add(1);
        h.add(2);
        System.out.println(h); // 1 2 3 -> unique
        h.remove(1);
        System.out.println(h.contains(2)); // true
        System.out.println(h.contains(1)); // false
        System.out.println(h.size()); // 2
        h.add(48);
        h.add(12);
        h.add(17);
        h.add(11);
        h.add(111);
        // unordered
        System.out.println(h); // unordered
    }
    static void LinkedHashset(){
        LinkedHashSet<Integer> h = new LinkedHashSet<>(); // all element are unique and ordered
        h.add(1);
        h.add(2);
        h.add(3);
        System.out.println(h); // 1 2 3
        h.add(1);
        h.add(1);
        h.add(2);
        System.out.println(h); // 1 2 3 -> unique
        h.remove(1);
        System.out.println(h.contains(2)); // true
        System.out.println(h.contains(1)); // false
        System.out.println(h.size()); // 2
        h.add(48);
        h.add(12);
        h.add(17);
        h.add(11);
        h.add(111);
        // unordered
        System.out.println(h); // ordered
    }
    static void Tree_set(){
        TreeSet<Integer> h = new TreeSet<>(); // all element are unique and sorted
        h.add(1);
        h.add(2);
        h.add(3);
        System.out.println(h); // 1 2 3
        h.add(1);
        h.add(1);
        h.add(2);
        System.out.println(h); // 1 2 3 -> unique
        h.remove(1);
        System.out.println(h.contains(2)); // true
        System.out.println(h.contains(1)); // false
        System.out.println(h.size()); // 2
        h.add(48);
        h.add(12);
        h.add(17);
        h.add(11);
        h.add(111);
        // unordered
        System.out.println(h); // sorted
    }
    public static void main(String[] args) {
//        Hashset();
//        LinkedHashset();
        Tree_set();
    }
}
