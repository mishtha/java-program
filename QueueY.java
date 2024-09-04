// import java.util.*;

// public class QueueY {
//     static class Queue {
//         static int arr[];
//         static int size; // storig the size of arr ...front already from 0index always
//         static int rear = -1; // making rear

//         Queue(int size) { // contructor for size of arr
//             arr = new int[size]; // declare an arr
//             this.size = size; // initilize size

//         }

//         public static boolean isEmpty() { // shows queue is empty or have element
//             return rear == -1;
//         }

//         // enqueue --> add element
//         public static void add(int data) {
//             if (rear == size - 1) { // check first queue is full or not
//                 System.out.println("full queue");
//                 return;
//             }
//             rear++;
//             arr[rear] = data;
//         }

//         // dequeue-->remove and and return element O(n)
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int front = arr[0]; // 0 index hata diya
//             for (int i = 0; i < rear; i++) { // piche kai elements ko ek ek karke aghe shift kar dege time complexity
//                                              // 0(n)
//                 arr[i] = arr[i + 1];
//             }
//             rear--;
//             return front;

//         }

//         // peek --> show top
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return arr[0];
//         }

//     }

//     public static void main(String args[]) {
//         // implement queue
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

//implement circular queue using arr
// public class QueueY {
//     static class Queue {
//         static int arr[];
//         static int size; // storig the size of arr ...front already from 0index always
//         static int rear = -1; // making rear
//         static int front = -1;

//         Queue(int size) { // contructor for size of arr
//             arr = new int[size]; // declare an arr
//             this.size = size; // initilize size

//         }

//         public static boolean isEmpty() { // shows queue is empty or have element
//             return rear == -1 && front == -1;
//         }

//         // full condition
//         public static boolean isFull() {
//             return (rear + 1) % size == front;
//         }

//         // enqueue --> add element
//         public static void add(int data) {
//             if (isFull()) { // check first queue is full or not
//                 System.out.println("full queue");
//                 return;
//             }
//             // 1st element add
//             if (front == -1) {
//                 front = 0;
//             }
//             rear = (rear + 1) % size; // increase rear
//             arr[rear] = data;
//         }

//         // dequeue-->remove and and return element O(1)
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int result = arr[front]; // 0 index hata diya
//             if (rear == front) { // if queue has single element
//                 rear = front = -1;
//             } else {
//                 front = (front + 1) % size; // when front in last index or ushe 0 indx pai lana hai

//             }
//             return front;

//         }

//         // peek --> show top
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return arr[front];
//         }

//     }

//     public static void main(String args[]) {
//         // implement queue
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         System.out.println(q.remove());
//         q.add(6);
//         System.out.println(q.remove());
//         q.add(7);
//         //123
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

//implementation of queue using ll
// import java.util.*;

// public class QueueY {
//     static class Node {
//         int data;
//         Node next;

//         // constructor
//         Node(int data) {
//             this.data = data;
//             next = null;
//         }
//     }

//     static class Queue {
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty() { // shows queue is empty or have element
//             return head == null & tail == null;
//         }

//         // enqueue --> add element O(1)
//         public static void add(int data) {
//             Node newNode = new Node(data);
//             if (tail == null) {
//                 tail = head = newNode;
//                 return;
//             }

//             tail.next = newNode;
//             tail = newNode;
//         }

//         // dequeue-->remove and and return element O(1)
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int front = head.data;

//             if (head == tail) {// if single element
//                 tail = null;
//             }
//             head = head.next;
//             return front;
//         }

//         // peek --> show top
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return head.data;
//         }

//     }

//     public static void main(String args[]) {
//         // implement queue
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

//implementation of queue by collectionframework
//que difference on caspack memorybetween arraylist and linked list implimentation
// import java.util.*;

// public class QueueY {

//     public static void main(String args[]) {
//         // implement queue
//         // Queue q = new Queue();
//         //1st 
//         Queue<Integer> q = new ArrayDeque<>();
//         //2nd
//         // Queue<Integer> q = new LinkedList<>(); //queue is interface object is made up of only classes so use linked list here
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


//Que queue using 2 stacks
import java.util.*;

public class QueueY {
    static class Queue{
        
            static Stack<Integer> s1 = new Stack<>();
            static Stack<Integer> s2 = new Stack<>();
            public static boolean isEmpty(){
                return s1.isEmpty();
            }
            public static void add(int data){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());// s1 sai pop karke s2 me push kar diya sare elements ko
                }
                s1.push(data);
                
                    
                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                }
            }
            public static int remove(){
                if(isEmpty()){
                    System.out.println("empty queue");
                    return -1;
                }
                return s1.pop();
            }
            public static int peek(){
                if(isEmpty()){
                    System.out.println("empty queue");
                    return -1;
                }
                return s1.peek();
            }
            
        }


    

    public static void main(String args[]) {
        
        Queue q = new Queue();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

