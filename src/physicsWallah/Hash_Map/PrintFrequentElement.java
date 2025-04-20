package physicsWallah.Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class PrintFrequentElement {
    public static void main(String[] args) {
        int []arr = {1,3,2,2,2,2,2,1,4,1};
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i]))mp.put(arr[i],1);
            else mp.put(arr[i],mp.get(arr[i])+1);
        }
        int max = 0;
        int ans = -1;
        for(var i: mp.keySet()){
            if(max<mp.get(i)){
                max = mp.get(i);
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
