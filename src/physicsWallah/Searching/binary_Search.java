package physicsWallah.Searching;

//implementing binary search

public class binary_Search {

    //boolean method, if found return true else return false
    static boolean search(int []arr,int target){

        //creating pointers
        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            //finding mid
            int mid = start + (end - start)/ 2;

            if(target == arr[mid]){
                return true;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        //passing sorted array
        int []arr = {1,2,3,4,5};
        int target = 6;

        System.out.println(search(arr,target));

    }
}
