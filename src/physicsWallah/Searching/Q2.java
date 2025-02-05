package physicsWallah.Searching;

//finding last occurrence

public class Q2 {
    static int Search(int []arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int lastOccurence = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                lastOccurence = mid;
                start = mid + 1;
            }
            else if(target > arr[mid])start = mid + 1;
            else end = mid - 1;
        }
        return lastOccurence;
    }

    public static void main(String[] args) {
        int []a = {5,5,5,5,6,6,8,9,9,9};
        int target = 9;
        System.out.println(Search(a,target));
    }
}
