package physicsWallah.Stack.Questions;
import java.util.Stack;
//import java.util.Scanner;
public class moveStackInSameOrder {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        //taking input from user
//        int n;
//        System.out.print("Enter the number of element: ");
//        n = sc.nextInt();
//        System.out.println("Enter the elements: ");
//        for(int i=1;i<=n;i++){
//            int x = sc.nextInt();
//            stack.push(x);
//        }
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        //reverse order
        Stack<Integer> rt = new Stack<>();
        while(!stack.isEmpty()){
            rt.push(stack.pop());
        }
        System.out.println(rt);

        //again reverse
        Stack<Integer> gt = new Stack<>();
        while(!rt.isEmpty()){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
