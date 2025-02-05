package physicsWallah.RotatedArray;

//binary search is applied three times here

public class findTarget {
    static int pivotSearch(int []arr,int start,int end){
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] <= arr[arr.length-1]){
                end = mid-1;
                ans = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }

    static int binarySearch(int []arr,int start,int end,int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)return mid;
            else if(arr[mid] < target)start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    static int search(int []arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int pivot = pivotSearch(arr,start,end);
        int ans1 = binarySearch(arr,start,pivot-1,target);
        int ans2 = binarySearch(arr,pivot,end,target);
        if(ans1 > ans2)return ans1;
        else return ans2;
    }

    public static void main(String[] args) {
        int []arr = {3,4,5,1,2};
        int target = 1;
        System.out.println(search(arr,target));
    }
}
