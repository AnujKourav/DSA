package physicsWallah.Stack.Questions;

import java.util.Stack;

public class RemoveConsecutiveSubSequence {
    static int[] removeElement(int[]arr){
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty() || arr[i] != st.peek()) st.push(arr[i]);
            else if(arr[i] == st.peek()){
                if(i==arr.length-1 || arr[i] != arr[i+1])st.pop();
            }
        }
        int []ans = new int[st.size()];
        int i = st.size()-1;
        while(!st.isEmpty()){
            ans[i--] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int []ans = removeElement(arr);
        for(int num:ans){
            System.out.print(num+ " ");
        }
    }
}
