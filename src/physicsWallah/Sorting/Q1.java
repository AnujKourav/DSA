package physicsWallah.Sorting;

public class Q1 {
    public static void main(String[] args) {

        //Input array is given
        int []a = {0 ,5, 0, 3, 42 , 0, 0};

        //printing input array
        System.out.print("Input array: ");
        for(int val :a){
            System.out.print(val + " ");
        }

        //Outer loop for traversing the array
        for(int i=0;i<a.length-1;i++){
            if(a[i] == 0){

                //creating boolean flag for optimization
                boolean flag = false;

                //Inner loop for comparison
                for(int j=i+1;j<a.length;j++){
                    //checking conditions if true then swap
                    if(a[j] != 0){
                        flag = true;
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        break;
                    }
                }
                if(!flag) {
                    System.out.print("\nOutput Array: ");
                    for(int val : a){
                        System.out.print(val +" ");
                    }
                    return;
                }
            }
        }
        //printing final result
        System.out.print("\nOutput Array: ");
        for(int val :a){
            System.out.print(val +" ");
        }
    }
}
