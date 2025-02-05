package physicsWallah.Searching;

//using recursion in binary search

public class recursive_Binary_Search {
    static boolean search(int []arr, int target,int start,int end){
        if(start > end)return false;
        int mid = start + (end - start) / 2;
        if(target == arr[mid])return true;
        else if(target > arr[mid]) return search(arr,target,mid+1,end);
        else return search(arr,target,start,mid-1);
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int target = 9;
        System.out.println(search(arr,target,0,arr.length-1));
    }
}
