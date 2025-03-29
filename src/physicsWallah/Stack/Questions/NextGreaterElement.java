package physicsWallah.Stack.Questions;

import java.util.Stack;

public class NextGreaterElement {
    static int[] Method1(int []arr){ // -> time complexity = O(n)^2, S.C. = O(1)
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    arr[i] = arr[j];
                    break;
                }
                else if(j == arr.length-1 && arr[j] < arr[i])arr[i] = -1;
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
    static int[] Method2(int []arr){
        Stack<Integer>st = new Stack<>();
        st.push(arr[arr.length-1]);
        arr[arr.length-1] = -1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] > st.peek()){
                while(st.isEmpty() && arr[i] > st.peek()){
                    st.pop();
                }
            }
            else if(arr[i] < st.peek()){
                arr[i] = st.peek();
                st.push(arr[i]);
            }
            else if(st.isEmpty()){
                st.push(arr[i]);
                arr[i] = -1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {1,3,2,1,8,6,3,4};
        int []ans = Method1(arr);
        for(int num: ans){
            System.out.print(num + " ");
        }
        System.out.println();
        int []res = Method2(arr);
        for(int num:res){
            System.out.print(num + " ");
        }
    }
}
