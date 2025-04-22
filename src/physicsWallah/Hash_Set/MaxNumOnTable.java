package physicsWallah.Hash_Set;

import java.util.HashSet;

public class MaxNumOnTable {
    public static int maxNumbers(int []bag){
        HashSet<Integer> table = new HashSet<>();
        int max = 0;
        for(int i=0;i<bag.length;i++){
            if(table.contains(bag[i])){
                table.remove(bag[i]);
            }
            else {
                table.add(bag[i]);
                max = Math.max(max,table.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []nums = {2,1,1,3,2,3};
        System.out.println(maxNumbers(nums));
    }
}
