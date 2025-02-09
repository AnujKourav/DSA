package physicsWallah.Arraylist;

import java.util.Arrays;

public class ArrayList {
    int []arr = new int[2];
    int idx = 0;
    public void add(int ele){
        if(idx == arr.length){
            arr = Arrays.copyOf(arr,arr.length*2);
        }
        arr[idx++] = ele;
    }
    public void size(){
        System.out.println(arr.length);
    }
    public void get(int idx){
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.get(2);
        arr.size();
    }
}
