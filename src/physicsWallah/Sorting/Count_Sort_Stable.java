package physicsWallah.Sorting;

public class Count_Sort_Stable {
    static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void countSort(int[]arr){
        int max = arr[0];
        for(int val:arr){
            if(val > max) max = val;
        }
        int []freq = new int[max + 1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        System.out.println("frequency array: ");
        display(freq);
//        int []prefixSum = new int[max + 1];
//        prefixSum[0] = freq[0];
//        for(int i=1;i<prefixSum.length;i++){
//            prefixSum[i] = freq[i] + prefixSum[i-1];
//        }
        for(int i=1;i<freq.length;i++){
            freq[i] = freq[i] + freq[i-1];
        }
        System.out.println("prefix_Sum array: ");
        display(freq);
        int []ans = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            int idx = freq[arr[i]] - 1;
            ans[idx] = arr[i];
            freq[arr[i]]--;
        }
        System.out.println("Array after sorting: ");
        display(ans);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,0,1,4,1,0,2};
        System.out.println("Array before sorting: ");
        display(arr);
        countSort(arr);
    }
}
