package physicsWallah.RotatedArray;

public class Find_Min {
    static int findMin(int []arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = i;
                break;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int []arr = {2,3,4,5,1};
        System.out.println(findMin(arr));
    }
}
