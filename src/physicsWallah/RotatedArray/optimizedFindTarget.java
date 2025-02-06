package physicsWallah.RotatedArray;

//In this only one binary search is applied

public class optimizedFindTarget {

    static int search(int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)return mid;
            if(arr[mid] < arr[end]){
                if(target > arr[mid] && target <= arr[end])start = mid + 1;
                else end = mid - 1;
            }
            else{
                if(target >= arr[start] && target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {3,4,5,6,7,8,9,1,2};
        int target = 1;
        System.out.println(search(arr,target));
    }
}
