package physicsWallah.Matrix_Search;

//Searching in 2D matrix

public class Q2 {

    static boolean search(int [][]arr, int target){
        int n = arr.length;
        int m = arr[0].length;
        int i = 0;
        int j = m-1;
        while(i<n && j>=0){
            if(arr[i][j] == target) return true;
            else if(target < arr[i][j]) j--;
            else i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 14;
        System.out.println(search(arr,target));
    }
}
