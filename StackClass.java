// import java.util.*;
// //stack by ll
// public class StackClass {
//     // ll single node reprensent by nide class
//     static class Node {
//         int data;
//         Node next;

//         // constructor
//         public Node(int data) {
//             this.data = data;
//             next = null;
//         }
//     }

//     // stack in form of ll
//     static class Stack {
//         public static Node head;

//         public static boolean isEmpty() {
//             return head == null;
//         }
//        //push
//         public static void push(int data) {
//             Node newNode = new Node(data);
//             if (isEmpty()) {
//                 head = newNode;
//                 return;

//             }
//             newNode.next = head;
//             head = newNode;

//         }
//         //pop(top element delete and return that element)
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next; //delete top
//             return top;
//         }
//         //peek(represent top)
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }

//             return head.data;
//         }

//     }

//     public static void main(String args[]) {
//         //make a stack  function
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
// }

//stack implement by arraylist
// import java.util.*;

// public class StackClass {
//     static class Stack{
//      static ArrayList<Integer> list = new ArrayList<>();
//     public static boolean isEmpty(){
//         return list.size() == 0;
//     }
//     //push
//     public static void push(int data){
//         list.add(data);
//     }
//     //pop(last element in array is our top usko delete karna hai)
//     public static int pop(){
//         if(isEmpty()){
//             return -1;
//         }
//         int top = list.get(list.size()-1); //list.size-1 is last index which is our top
//             list.remove(list.size()-1);
//             return top;

//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }
    

   

        

//     public static void main(String args[]) {
//         // make a stack function
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);;
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
// }





// stack emplement by collectionframework
// import java.util.*;
// public class StackClass{

//     public static void main(String args[]){
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
// }

  

// Que1. push at the bootom of the stack
// import java.util.*;
// public class StackClass{
//     public static void pushaAtBottom(int data, Stack<Integer> s){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//             pushaAtBottom(data, s);
//             s.push(top);
//         }
    


// public static void main(String args[]){
// Stack<Integer> s = new Stack<>();
//       s.push(1);
//       s.push(2);
//       s.push(3);
//       pushaAtBottom(4, s);
//       while(!s.isEmpty()){
//         System.out.println(s.peek());
//         s.pop();
//       }

// }
//}

//que2 reverse a stack
import java.util.*;
public class StackClass{
    public static void pushaAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop(); //top remove
            pushaAtBottom(data, s);
            s.push(top);
        }
        public static void reverse(Stack<Integer> s){
            //base case (if stack is empty)
            if(s.isEmpty()){
                return;
            }
            //top nikala
            int top = s.pop();
            //chote stack ko reverse
            reverse(s);
            //top ko vapas push at bottom
            pushaAtBottom(top, s);
        }
    


public static void main(String args[]){
Stack<Integer> s = new Stack<>();
      s.push(1);
      s.push(2);
      s.push(3);
      reverse(s);
      
      while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
      }

}
}

