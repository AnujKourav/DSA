package physicsWallah.Sorting;

//swap two unsorted element in linear time

public class Q3 {
    public static void display(int []arr){
        for(int val : arr){
            System.out.print(val +" ");
        }
        System.out.println();
    }
    public static void sort(int []arr){
        int n = arr.length;
        int x = -1;
        int y = -1;

        if(n<=1)return; //corner case or edge case

        //process all adjacent element
        for(int i=1;i<n;i++){
            if(arr[i-1] > arr[i]) {
                if (x == -1) { //1st conflict
                    x = i - 1;
                    y = i;
                } else { //2nd conflict
                    y = i;
                }
            }
        }
        //swapping
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int []arr = {10,5,6,7,8,9,3};
        sort(arr);
        display(arr);
    }
}
