package physicsWallah.Hash_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<HashMap<Character,Integer>> list = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            list.add(makeFreqMap(strs[i]));
        }
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        boolean[] used = new boolean[strs.length];
        for(int i=0;i<list.size();i++){
            if(used[i])continue;

            ArrayList<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;

            for(int j=i+1;j<list.size();j++){
                if(!used[j] && list.get(i).equals(list.get(j))){
                    group.add(strs[j]);
                    used[j] = true;
                }
            }
            ans.add(group);
        }
        return new ArrayList<>(ans);
    }
    static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!mp.containsKey(ch))mp.put(ch,1);
            else mp.put(ch,mp.get(ch)+1);
        }
        return mp;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = groupAnagrams(strs);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j) +" ");
            }
            System.out.println();
        }
    }
}
