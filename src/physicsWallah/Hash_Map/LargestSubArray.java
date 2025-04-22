package physicsWallah.Hash_Map;

import java.util.HashMap;

public class LargestSubArray {
    static int zeroSumLargestSubArray(int []arr){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int preSum = 0;
        int maxLen = 0;
        mp.put(0,-1);
        for(int i=0;i<arr.length;i++){
            preSum += arr[i];
            if(mp.containsKey(preSum))maxLen = Math.max(maxLen,i-mp.get(preSum));
            else mp.put(preSum,i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int []arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(zeroSumLargestSubArray(arr));
    }
}
