package physicsWallah.Hash_Map;

import java.util.HashMap;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        // if(s.length() != t.length())return false;
        // char[] arr1 = s.toCharArray();
        // Arrays.sort(arr1);
        // char[] arr2 = t.toCharArray();
        // Arrays.sort(arr2);
        // for(int i=0;i<arr1.length;i++){
        //     if(arr1[i] != arr2[i])return false;
        // }
        // return true;


        if(s.length() != t.length())return false;
        HashMap<Character,Integer> mp = makeFreqMap(s);
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!mp.containsKey(ch))return false;
            mp.put(ch,mp.get(ch)-1);
            if(mp.get(ch)==0)mp.remove(ch);
        }
        if(mp.isEmpty())return true;
        return false;
    }
    static HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!mp.containsKey(ch)) mp.put(ch,1);
            else mp.put(ch,mp.get(ch)+1);
        }
        return mp;
    }

    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));
    }
}
