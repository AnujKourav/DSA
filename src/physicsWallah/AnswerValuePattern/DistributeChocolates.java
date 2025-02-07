package physicsWallah.AnswerValuePattern;

//finding minimal of maximums

public class DistributeChocolates {

    static boolean isDivisionPossible(int []arr, int m, int maxChocoAllowed){
        int numOfStudent = 1;
        int choc = 1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxChocoAllowed) return false;
            if(choc + arr[i] <= maxChocoAllowed){
                choc += arr[i];
            }
            else{
                numOfStudent++;
                choc = arr[i];
            }
        }
        if(numOfStudent > m)return false;
        return true;
    }

    static int distributeChocolate(int []arr, int m){
        if(arr.length < m)return -1;
        int ans = 0,st = 1, end = (int)1e9;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(isDivisionPossible(arr,m,mid)){
                ans = mid;
                end = mid - 1;
            }
            else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []a = {5,3,1,4,2};
        int m = 3;
        System.out.println(distributeChocolate(a,m));
    }
}
