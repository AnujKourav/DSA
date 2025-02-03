package physicsWallah.Sorting;

//segregate array in positive and negative in any order

public class Q4 {

    public static void display(int []arr){
        for(int val:arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void segregate(int []arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            while(arr[i] < 0)i++;
            while(arr[j] >= 0)j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {19,-20,0,7,-4,-13,11,0,-5,3};
        segregate(arr);
        display(arr);
    }

}
