package physicsWallah.Hash_Set;

import java.util.HashSet;

public class Basics {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Anuj");
        hs.add("James");
        hs.add("Scott");
        hs.add("Scott"); // Maintain uniqueness
        System.out.println(hs); // Anuj , James , Scott
        System.out.println(hs.contains("Anuj")); // true
        System.out.println(hs.contains("Kourav")); // false
        System.out.println(hs.size()); // 3
        System.out.println(hs.remove("Anuj")); // true
        System.out.println(hs);
        System.out.println(hs.remove("Anuj")); // false doesn't exist
        System.out.println(hs.size()); // 2
        System.out.println(hs);
        for(var s: hs){ // for traversing
            System.out.println(s);
        }
    }
}
