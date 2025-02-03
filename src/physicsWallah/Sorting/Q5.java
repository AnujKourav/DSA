package physicsWallah.Sorting;

//Example of count sort when the range is given or can be found

public class Q5 {

    public static void display(int []arr){
        for(int val:arr){
            System.out.print(val +" ");
        }
        System.out.println();
    }

    public static void sort(int []arr){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0)count0++;
            else if(arr[i] == 1)count1++;
            else count2++;
        }
        int i = 0;
        while(count0 > 0){
            arr[i++] = 0;
            count0--;
        }
        while(count1 > 0){
            arr[i++] = 1;
            count1--;
        }
        while(count2 > 0){
            arr[i++] = 2;
            count2--;
        }
    }

    public static void main(String[] args) {
        int []arr = {0,2,1,2,0,0};
        sort(arr);
        display(arr);
    }
}
