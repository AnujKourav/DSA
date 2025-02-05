package physicsWallah.Searching;

//Finding root using binary search

public class Q4 {

    static int root(int a){
        int start = 0;
        int end = a;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int val = mid * mid; //we can use long to avoid overflow
            if(val == a)return mid;
            else if(val > a)end = mid - 1;
            else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 24;
        System.out.println(root(a));
    }
}
