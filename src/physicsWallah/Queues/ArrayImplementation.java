package physicsWallah.Queues;

public class ArrayImplementation {
    //it comes with limitation that we cannot add element more than it's capacity
    //unlike stack where we can pop the element from the array and again can push element
    public static class queueArray{
        int []arr = new int[5];
        int front = -1;
        int rear = -1;
        int size = 0;
        public void add(int val){
            if(rear == arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1) {
                front = rear = 0;
                arr[rear] = val;
            }
            else {
                arr[++rear] = val;
            }
            size++;
        }
        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = arr[front];
            front++;
            size--;
            return x;
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
        public boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
        public void display(){
            if(size == 0) {
                System.out.println("Queue is Empty");
            }
            else{
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i] +" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        queueArray q1 = new queueArray();
        System.out.println(q1.isEmpty());
        System.out.println(q1.size);
        q1.add(1);
        q1.display();
        q1.add(2);
        q1.display();
        q1.add(3);
        q1.display();
        q1.add(4);
        q1.display();
        q1.add(5);
        q1.display();
        System.out.println(q1.isEmpty());
        System.out.println(q1.remove());
        q1.display();
        System.out.println(q1.peek());
        q1.display();
        q1.remove();
        q1.display();
    }
}
