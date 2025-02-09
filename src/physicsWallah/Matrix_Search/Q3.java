package physicsWallah.Matrix_Search;

//find peak indices from an array that is forming a mountain

public class Q3 {

    static int peak(int []arr){
        int start = 0;
        int end = arr.length-1;
        if(arr.length < 3)return -1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid+1]) {
                ans = mid + 1;
                start = mid + 1;
            }
            else end = mid - 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int []arr = {1,7,6,5,4,3,2,1,0};
        System.out.println(peak(arr));
    }
}
