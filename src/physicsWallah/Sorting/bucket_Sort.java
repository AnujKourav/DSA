package physicsWallah.Sorting;
import java.util.*;
public class bucket_Sort {

    static void bucketSort(float[] arr){
        int n = arr.length;

        //Array of arraylist
        ArrayList<Float>[] buckets = new ArrayList[n];

        //create empty buckets of Arraylist
        for(int i=0;i<n;i++){
            buckets[i] = new ArrayList<>();
        }

        //Add elements into our buckets
        for(int i=0;i<n;i++){
            int bucketIndex = (int)arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }

        //sort each buckets individually
        for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }

        //merge all buckets to get final sorted array
        int index = 0;
        for(int i=0;i<buckets.length;i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j=0;j<currBucket.size();j++){
                arr[index++] = currBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
        float []arr  = {0.5f,0.4f,0.3f,0.2f,0.1f};
        bucketSort(arr);
        for(float val: arr){
            System.out.print(val+" ");
        }
    }
}
