package physicsWallah.Sorting;
//Import java package of scanner class
import java.util.Scanner;

//create class for bubble sort
public class BubbleSort {

    //Main method or entry point of the code
    public static void main(String[] args) {

        //creating object of Scanner class to use it
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        //taking size as inout from user
        int size = sc.nextInt();

        //creating the array of size taken by user
        int []arr = new int[size];

        System.out.println("Enter the element in an array: ");
        //putting element in an array with the help of user
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        //calling method bubble sort and passing the array as parameter
        bubbleSort(arr);

        //printing the final result
        System.out.println("Array after sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int []arr){
        //outer loop for traversing the array
        for(int i=0;i<arr.length-1;i++) {

            //creating boolean flag to see if any rotation is happening or notf
            //of not then the value of flag remain same and it returns and no more iteration will happen
            boolean flag = false;

            //inner loop for sorting or interchanging the element
            for (int j = 0; j < arr.length - i - 1; j++) {

                //change element if next element is smaller than current element
                if(arr[j]>arr[j+1]){

                    //using temp variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //if exchanging once in full cycle then the value of flag will change
                    //and next iteration will take place
                    flag = true;
                }
            }
            //if no interchange of element is done that mens all element is in its correct position
            //and it will return the value of text
            if (!flag) return;
        }
    }
}
