package physicsWallah.Hash_Map;

import java.util.HashMap;

public class Isomorphic {
    static public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(mp.containsKey(ch1)){
                if(mp.get(ch1) != ch2)return false;
            }
            else if(mp.containsValue(ch2)) return false;
            else{
                mp.put(ch1,ch2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s,t));
    }
}
