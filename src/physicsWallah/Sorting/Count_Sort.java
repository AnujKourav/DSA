package physicsWallah.Sorting;

public class Count_Sort {
    static void display(int []arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    static void countSort(int []arr){
        int max = arr[0];
        //finding maximum element in an array
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //creating frequency array of maximum element + 1
        int []freq = new int[max + 1];
        //traverse the array and increase the frequency of element at there index
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        //now replace the element in sorting order in original array
        int k = 0;
        for(int i=0;i<freq.length;i++){
            while(freq[i] > 0){
                arr[k] = i;
                freq[i]--;
                k++;
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {4,3,1,5,3,1,3,5};
        System.out.println("Array before sorting: ");
        display(arr);
        countSort(arr);
        System.out.println("Array after sorting: ");
        display(arr);
    }
}
