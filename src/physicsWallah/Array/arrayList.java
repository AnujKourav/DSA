package physicsWallah.Array;
import java.util.ArrayList;
//public class arrayList {
//    public static void main(String[] args) {
//
//        //Wrapper class
////        Integer i = Integer.valueOf(4);
////        System.out.println(i);
//
//        //Syntax for arraylist
//        ArrayList<Integer> l1 = new ArrayList<>();
//
//        //Some method for arraylist
//
//        //Add element in arraylist
//        l1.add(2); //2
//        l1.add(3); //2 3
//        l1.add(4); //2 3 4
//        l1.add(5); //2 3 4 5
//
//        //Get an element at index i
////        System.out.println(l1.get(0)); //2
//
//        //Print with for loop
////        for(int j=0;j<l1.size();j++){
////            System.out.print(l1.get(j)+" ");  //2 3 4 5
////        }
//
//        //Printing arraylist directly without any loop
//        System.out.println(l1); //[2,3,4,5]
//
//        //adding element at some index i [2 100 3 4 5]
//        l1.add(1,100);
//        System.out.println(l1);
//
//        //modifying element at index i //[2 100 300 4 5]
//        l1.set(2,300);
//        System.out.println(l1);
//
//        //removing an element at index i
//        l1.remove(1);
//        System.out.println(l1); //[2 300 4 5]
//
//        //removing an element e
//        l1.remove(Integer.valueOf(300));
//        System.out.println(l1); //[2,4,5]
//
//        //checking if an element exist or not
//        boolean ans = l1.contains(Integer.valueOf(4));
//        System.out.println(ans);
//
//        //if you don't specify class, you can put anything inside l
//        ArrayList l = new ArrayList();
//        l.add("pqres");
//        l.add(1);
//        l.add('e');
//        System.out.println(l);
//    }
//}

import java.util.Collection;
import java.util.Collections;
class arrayList{
    static void reverseList(ArrayList<Integer> list){
        int i=0 , j=list.size()-1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(33);
        list.add(14);
        list.add(50);
        list.add(0);
        list.add(7);
        System.out.println("Original List: "+list);
//        reverseList(list);
        Collections.reverse(list);
        System.out.println("Reverse List: "+list);
        Collections.sort(list);
        System.out.println("Ascending Sorted list: "+ list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Sorted list: "+list);
    }
}
























