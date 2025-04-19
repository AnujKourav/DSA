package physicsWallah.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(3,"Aman");
        mp.put(1,"Rohan");
        mp.put(2,"Riya");
        System.out.println(mp); // -> unordered
        System.out.println(mp.get(2)); // Riya
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("Aman"));
        mp.put(1,"anuj");
        System.out.println(mp); // -> over-rides
        mp.putIfAbsent(2,"Ram"); // -> do not over-ride
        System.out.println(mp);
        System.out.println(mp.entrySet()); // -> printing whole mapping
        System.out.println(mp.keySet()); // -> print only keys
        System.out.println(mp.values()); // -> print only values

        //Iterating over keys in a map
        for(Integer i: mp.keySet()){
            System.out.println(i);
        }
        //Iterating over values in a map
        for(String i: mp.values()){
            System.out.println(i);
        }
        //Iterating over values in a map
        for(var i: mp.values()){ // -> also we can use var if we don't want to define data type
            System.out.println(i);
        }
        //Iterating over key-values in a map
        for(var i: mp.entrySet()){
            System.out.println(i);
        }
        //Iterating over key in a map
        for(var i: mp.entrySet()){
            System.out.println(i.getKey());
        }
        //Iterating over values in a map
        for(var i: mp.entrySet()){
            System.out.println(i.getValue());
        }
    }
}
