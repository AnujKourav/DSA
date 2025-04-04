package physicsWallah.Queues;

public class CircularQueueArray {
    int []arr = new int[8];
    int front = -1;
    int rear = -1;
    int size = 0;
    int n = arr.length;
    void add(int val) throws Exception{
        if(size == n){
            throw new Exception("Queue is full");
        }
        else if(size == 0){
            front = rear = 0;
            arr[rear] = val;
        }
        else if(rear < n-1){
            arr[++rear] = val;
        }
        else if(rear == n-1){
            rear = 0;
            arr[rear] = val;
        }
        size++;
    }
    int remove() throws Exception {
        if(size == 0){
            throw new Exception("Queue is empty");
        }
        else{
            int val = arr[front];
            if(front == n-1) front = 0;
            else front++;
            size--;
            return val;
        }
    }
    int peek() throws Exception{
        if(size == 0) {
            throw new Exception("Queue is empty");
        }
        return arr[front];
    }
    void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        else if(front <= rear){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{
            for(int i=front;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    boolean isEmpty(){
        if(size==0)return true;
        return false;
    }
    public static void main(String[] args) throws Exception{
        CircularQueueArray q1 = new CircularQueueArray();
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
        q1.add(6);
        q1.add(7);
        q1.add(7);
        q1.add(8);
        q1.add(8);
        q1.display();
        q1.remove();
        q1.add(9);
        q1.display();
    }
}
