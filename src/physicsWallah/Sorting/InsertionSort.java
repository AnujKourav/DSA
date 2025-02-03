package physicsWallah.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        //Array a taken as input
        int []a = {8, 3, 6, 5, 4, 2};

        //call Insertion sort Method
        insertionSort(a);

        //printing final result after sorting the array
        for(int val: a){
            System.out.print(val+" ");
        }
    }
    public static void insertionSort(int []a){
        int n = a.length;

        //Outer loop for traversing the array
        for(int i=1;i<n;i++){

            //Inner loop for comparison
            for(int j=i;j>0;j--){

                //Comparing the elements
                if(a[j] < a[j-1]){

                    //Swap element and place them in correct order
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }

                else if(a[j] >= a[j-1]){
                    break;
                }
            }
        }
    }
}
