package physicsWallah.Sorting;
//importing Scanner class to take input from the user
import java.util.Scanner;

//Creating class Selection sort
public class SelectionSort {
    //Main method
    public static void main(String[] args) {

        //Creating the object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking input from the user as the size of an array
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        //creating array of length = size
        int []arr = new int[size];
        //taking input
        System.out.println("Enter the element in an array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        //call Selection sort method and passing the array as a parameter
        selectionSort(arr);

        //Printing the final result after sorting it
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSort(int[]arr){
        int n = arr.length;
        //outer loop for traversing
        for(int j=0;j<n-1;j++){ //current index that is going to be ordered
            //Inner loop for comparison
            for(int i=j+1;i<n;i++){
                //comparing element with all its right element and interchange them if condition is true
                if(arr[i] < arr[j]){
                    //swaps current element with ordered element 
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
