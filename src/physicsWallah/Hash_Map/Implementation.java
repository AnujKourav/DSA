package physicsWallah.Hash_Map;

import java.util.LinkedList;

public class Implementation {

    static class MyHashMap<K, V>{ //generics -> value K & V given in angular brackets are any data types
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // the number of entries in map
        private LinkedList<Node>[] buckets;
        private void initBuckets(int N){ // N - capacity/size of buckets array
            buckets = new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
        }
        private int HashFunc(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }
        //traverse the ll and looks for a node with key if found it return its index otherwise it returns null
        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        private void rehash(){
            LinkedList<Node>[] oldBucket = buckets;
            initBuckets(oldBucket.length * 2);
            n = 0;
            for(var bucket: oldBucket){
                for(var node: bucket){
                    put(node.key, node.value);
                }
            }
        }

        public int capacity(){
            return buckets.length;
        }

        public float load(){
            return (n*1.0f)/buckets.length;
        }

        public int size(){ // return the number of entries in map
            return n;
        }

        public void put(K key, V value){ // insert/update
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket, key);
            if(ei == -1){ // if key doesn't exist, we have to insert a new node
                Node node = new Node(key,value);
                currentBucket.add(node);
                n++;
            }
            else{ // update
                Node currNode = currentBucket.get(ei);
                currNode.value = value;
            }
            if(n >= buckets.length * DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }

        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei != -1){
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null; // if key doesn't exist
        }

        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei != -1){
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null; // key doesn't exist
        }
    }

    public static void main(String[] args) {
        MyHashMap<String ,Integer> mp = new MyHashMap<>();
        mp.put("a",1);
        mp.put("b",2);
        System.out.println(mp.capacity());
        System.out.println(mp.load());
        mp.put("c",3);
        System.out.println(mp.size()); // 3
        mp.put("c",30); //update
        System.out.println(mp.size()); // 3
        System.out.println(mp.get("a")); // 1
        System.out.println(mp.get("b")); // 2
        System.out.println(mp.get("c")); // 3
        System.out.println(mp.get("d")); //null
        System.out.println(mp.remove("c")); // 30
        System.out.println(mp.remove("c")); // null
        System.out.println(mp.size()); // 2

        System.out.println(mp.capacity());
        System.out.println(mp.load());
    }
}
