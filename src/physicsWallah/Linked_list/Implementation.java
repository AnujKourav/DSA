package physicsWallah.Linked_list;

public class Implementation {
    public static class Node{ // Node will behave as user defined data type
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{ // Linked list will behave as a data structure
        Node head = null;
        Node tail = null;
        int size = 0;
        void insert(int val,int index){ // Insert element at any index
            Node temp = new Node(val);
            Node ptr = head;
            if(index == 0){
                insertAtHead(val);
                return;
            }
            else if(index == size) {
                insertAtEnd(val);
                return;
            }
            else if(index < 0 || index > size){
                System.out.println("Wrong Input");
                return;
            }
            int i = 0;
            while(i < index-1){
                ptr = ptr.next;
                i++;
            }
            temp.next = ptr.next;
            ptr.next = temp;
            size++;
        }
        void insertAtHead(int val){ // Insert value at head
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAtEnd(int val){ // insert element at end
            Node temp = new Node(val);
            if(head == null){ // if list is empty then add element at starting
                head = temp;
            }
            else{ // if list is not empty then add element at end and increase the tail
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void display(){ //it will print the linked list
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }

        //size function is not needed as it is taking O(n) time
        //so we have created size variable that will take O(1) time
//        int size(){ // it will count the size of the linked list and return
//            int count = 0;
//            Node temp = head;
//            while(temp != null){
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }
        int getElement(int index){
            if(index < 0 || index > size){
                System.out.println("wrong input");
                return -1;
            }
            Node temp = head;
            int i = 0;
            while(i<index){
                temp = temp.next;
                i++;
            }
            return temp.data;
        }
        void deleteAtIndex(int index){

            Node temp = head;
            if(index < 0 || index > size){
                System.out.println("Wrong input");
                return;
            }
            else if(index == 0){
                head = head.next;
                size--;
                return;
            }
            int i = 0;
            while(i<index-1){
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(7); // 7
        ll.insertAtEnd(4); // 7 -> 4
        ll.display();
        System.out.println(ll.size); // it will print the size od the linked list
        ll.insertAtEnd(22); // 7 -> 4 -> 22
        ll.display();
        ll.insertAtHead(3); // 3 -> 7 -> 4 -> 22
        ll.display();
        System.out.println(ll.size);
        ll.insert(45,2); // 3 -> 7 -> 45 -> 4 -> 22
        ll.display();
        System.out.println(ll.size);
        ll.insert(10,5); // 3 -> 7 -> 45 -> 4 -> 22 -> 10
        ll.display();
        System.out.println(ll.tail.data);
        ll.insert(0,0); // 0 -> 3 -> 7 -> 45 -> 4 -> 22 -> 10
        ll.display();
        System.out.println(ll.size);
        ll.insert(45,54); // invalid input
        System.out.println(ll.getElement(3)); // 45
        System.out.println(ll.getElement(0)); // 0
        ll.deleteAtIndex(1); // 0 -> 7 -> 45 -> 4 -> 22 -> 10
        ll.display();
        ll.deleteAtIndex(43); // wrong input
        ll.deleteAtIndex(0); // 7 -> 45 -> 4 -> 22 -> 10
        ll.display();
        ll.deleteAtIndex(4); // 7 -> 45 -> 4 -> 22
        ll.display();
        System.out.println(ll.tail.data);
    }
}
