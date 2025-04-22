package physicsWallah.Hash_Map;

import java.util.HashMap;

public class Two_Sum {
//    static public int[] twoSum(int[] nums, int target) {
//        int []ans = new int[2];
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]+nums[j]==target){
//                    ans[0] = i;
//                    ans[1] = j;
//                    return ans;
//                }
//            }
//        }
//        return ans;
//    }

    static public int[] twoSum(int[] nums, int target) {
        int []ans = {-1};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x = target - nums[i];
            if(!mp.containsKey(x))mp.put(nums[i],i);
            else{
                return new int[]{i,mp.get(x)};
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int target = 9;
        int []ans = twoSum(nums,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }
    }
}
