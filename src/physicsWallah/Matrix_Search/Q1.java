package physicsWallah.Matrix_Search;

//searching in 2D matrix

public class Q1 {

    static int search(int [][]arr , int target){
        int n = arr.length;
        int m = arr[0].length;
        int start = 0;
        int end = n * m - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int midElt = arr[mid/m][mid%m];
            if(midElt == target)return mid;
            else if(midElt < target)start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [][]arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 16;
        System.out.println(search(arr,target));
    }
}
