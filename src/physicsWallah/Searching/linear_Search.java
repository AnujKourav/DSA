package physicsWallah.Searching;

public class linear_Search {

    //linear search, traverse array one by one and check for element
    static int search(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                //if found return index or true
                return i;
            }
        }
        //if not found return -1 or false
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1,5,3,2,6,8,4};
        int target = 2;
        System.out.println(search(arr,target));
    }
}
