package physicsWallah.Sorting;

public class Q2 {
    public static void main(String[] args) {
        String []arr = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min_index]) < 0){
                    min_index = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        System.out.print("Output result: ");
        for(String str :arr){
            System.out.print(str+" ");
        }
    }
}
