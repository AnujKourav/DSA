package physicsWallah.RotatedArray;

public class findMinBinarySearch {

    static int search(int []arr){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        int n = arr.length;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] <= arr[n-1]){
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] > arr[n-1]){
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr = {10,11,12,1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr));
    }
}
