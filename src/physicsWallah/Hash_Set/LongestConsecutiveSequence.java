package physicsWallah.Hash_Set;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int val : nums) h.add(val);
        int maxLen = 0;
        for (int val : h) {
            if (!h.contains(val - 1)) {
                int currNum = val;
                int currLen = 1;
                while (h.contains(currNum + 1)) {
                    currLen++;
                    currNum++;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int []nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
