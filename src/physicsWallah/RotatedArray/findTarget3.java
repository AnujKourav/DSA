package physicsWallah.RotatedArray;

//find target in repeated element

public class findTarget3 {

    static int search(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)return mid;
            else if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                start++;
                end--;
            }
            else if(arr[start] != arr[end] && arr[mid] == arr[end])end = mid - 1;
            else if(arr[start] != arr[end] && arr[start] == arr[end])start = mid + 1;
            else if(arr[mid] < target)start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {0,0,0,1,1,1,2,0,0,0};
        int target = 2;
        System.out.println(search(arr,target));
    }
}
