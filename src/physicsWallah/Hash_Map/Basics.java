package physicsWallah.Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Basics {
    static void hashmap(){

        //Syntax
        Map<String, Integer> mp = new HashMap<>();

        //Adding elements
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);

        //getting value of a key from the hashmap
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); // null

        //changing/updating the value of a key in the hashmap
        mp.put("Akash",25); // Akash -> 25

        //remove a pair from the hashmap
        System.out.println(mp.remove("Akash")); // 25
        System.out.println(mp.remove("Riya")); // null

        //checking if a key exist in the map
        System.out.println(mp.containsKey("Akash")); // boolean -> false because removed
        System.out.println(mp.containsKey("Harry")); // boolean -> true

        //adding a new entry only if the new key doesn't exist already
        if(!mp.containsKey("Yash")) mp.put("Yash",25);
        // OR
        mp.putIfAbsent("Yashika",30);

        //get all the keys in the hashmap
        System.out.println(mp.keySet());

        //get all the values in the hashmap
        System.out.println(mp.values());

        //get all entries in the hashmap
        System.out.println(mp.entrySet());

        //traversing all the entries of hashmap - multiple methods
        for(var i: mp.entrySet()){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        hashmap();
    }
}
