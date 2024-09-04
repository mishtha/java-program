import java.util.*;
public class HashMapcode {
    static class HashMap<K,V>{ //generice(genral type of value and key)
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // n - nodes
        private int N; // N - buckets
        //private int arr[]
        private LinkedList<Node> buckets[]; // N = bucket.length
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                //khali linked list create
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){ //key lega or bucket index return karega bi--> (0 to N-1)
            int bi = key.hashCode();
            //234567 ,- 234567
            return Math.abs(bi)%N;  //make neg value positive
        }
        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i=0; i<ll.size(); i++){
               if(ll.get(i).key == key){
                return i; //di
               }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            for(int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i=0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){
            //bi index nikala for check existance of function
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // data index-->ll kai ander index bata ra di = valid value key exist otherwise not exist
             if(di == -1){  //key not exist
              buckets[bi].add(new Node(key, value));
              n++;
            } 
            else { //key exist
              Node node = buckets[bi].get(di);
              node.value = value;
            }
            //check lamda value not greater than k
            double lamda = (double)n/N;
            if(lamda > 2.0){
                //rehashing
             rehash();
            }
        }
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // data index-->ll kai ander index bata ra di = valid value key exist otherwise not exist
             if(di == -1){  //key not exist
              return false;
            } 
            else { //key exist
              return true;
            }
        }
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // data index-->ll kai ander index bata ra di = valid value key exist otherwise not exist
             if(di == -1){  //key not exist
              return null;
            } 
            else { //key exist
              Node node = buckets[bi].remove(di);
              n--;
              return node.value;
            }
        }
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // data index-->ll kai ander index bata ra di = valid value key exist otherwise not exist
             if(di == -1){  //key not exist
              return null;
            } 
            else { //key exist
              Node node = buckets[bi].get(di);
               return node.value;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++){
            linkedList<Node> ll = buckets(i);
            for(int  j=0; j<ll.size(); j++){
                Node node = ll.get(j);
                keys.add(node.key);
            }
        }
        return keys;
    }
        public boolean isEmpty(){
            return n == 0;
        }
        
        public static void main(String args[]){
            HashMap<String, Integer> map = new HashMap<>();
            map.put("India", 190);
            map.put("China", 90);
            map.put("Us", 10);
            ArrayList<String> keys = map.keySet();
            for(int i=0; i<keys.size(); i++){
                System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
            }
        }
     
   }
}
