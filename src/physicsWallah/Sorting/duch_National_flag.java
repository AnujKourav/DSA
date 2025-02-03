package physicsWallah.Sorting;

//Sorting in single paas using duch national flag algorithm where we use three pointer
//and separate the 0's, 1's, and 2's from an array

public class duch_National_flag {

    static void display(int []arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    static void swap(int []arr,int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sort(int []arr){
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {2,1,1,2,2,0,0,1,1,2,2,0,1};
        sort(arr);
        display(arr);
    }
}
