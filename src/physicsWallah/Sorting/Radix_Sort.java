package physicsWallah.Sorting;

public class Radix_Sort {
    static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //function for finding maximum element
    public static int findMax(int []arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    //function for count sort
    public static void countSort(int []arr,int place){
        //frequency array
        int []freq = new int[10]; //make array frequency
        //place 1, arr[i] = 105 -> freq[5]++
        for(int i=0;i<arr.length;i++){
            freq[(arr[i]/place)%10]++;
        }
        System.out.println("frequency array: ");
        display(freq);
        //making frequency array as prefix sum array
        for(int i=1;i<freq.length;i++){
            freq[i] = freq[i] + freq[i-1];
        }
        System.out.println("prefix_Sum array: ");
        display(freq);
        int []ans = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int idx = freq[(arr[i]/place)%10] - 1;
            ans[idx] = arr[i];
            freq[(arr[i]/place)%10]--;
        }
        System.out.println("Array after sorting: ");
        display(ans);

        // Copy sorted elements back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void radixSort(int []arr){
        int max = findMax(arr); //get maximum element from an array
        //apply count sort to sort the element based on place value
        for(int place = 1;max/place>0;place = place * 10){
            countSort(arr,place);
        }
    }

    public static void main(String[] args) {
        int[] arr = {170,45,75,90,802,2};
        System.out.println("Array before sorting: ");
        display(arr);
        radixSort(arr);
    }
}
