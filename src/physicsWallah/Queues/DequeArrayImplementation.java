package physicsWallah.Queues;

public class DequeArrayImplementation {
    int []arr = new int[8];
    int front = -1;
    int rear = -1;
    int size = 0;
    int n = arr.length;
    void add(int val) throws Exception{
        addLast(val);
    }
    void addLast(int val) throws Exception{
        if(size == n)throw new Exception("Deque is full");
        if(rear == -1){
            front = rear = n/2;
            arr[rear] = val;
        }
        else{
            if(rear<n-1) arr[++rear] = val;
            else throw new Exception("Cannot add");
        }
        size++;
    }
    void addFirst(int val) throws Exception{
        if(size == n)throw new Exception("Deque is full");
        if(front == -1){
            front = rear = n/2;
            arr[front] = val;
        }
        else{
            if(front>0) arr[--front] = val;
            else throw new Exception("Cannot add");
        }
        size++;
    }
    int remove() throws Exception{
        return removeFirst();
    }
    int removeFirst()throws Exception{
        if(size == 0) throw new Exception("Queue is Empty");
        int x = arr[front++];
        size--;
        return x;
    }
    int removeLast() throws Exception{
        if(size == 0) throw new Exception("Queue is Empty");
        int x = arr[rear--];
        size--;
        return x;
    }
    int peek() throws Exception{
        if(size == 0) throw new Exception("Deque is empty");
        return arr[front];
    }
    boolean isEmpty(){
        if(size == 0)return true;
        else return false;
    }
    void display(){
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
    public static void main(String[] args) throws Exception{
        DequeArrayImplementation q = new DequeArrayImplementation();
        System.out.println(q.size);
        System.out.println(q.isEmpty());
        q.add(1);
        q.addFirst(2);
        q.addLast(3);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.display();
        System.out.println(q.removeFirst());
        q.display();
        System.out.println(q.removeLast());
        q.display();
    }
}
