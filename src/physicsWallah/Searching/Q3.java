package physicsWallah.Searching;

//finding square root

public class Q3 {
    static int root(int a){
        int i = 0;
        while(i * i <= a){
            i++;
        }
        return i-1;
    }
    public static void main(String[] args) {
        int a = 2;
        System.out.println(root(a));
    }
}
