
//public class LL {
    
//     Node head;
//     private int size; //variable for size sath kai sath bhi track kar sakte hai size ko
//     LL(){  //constructor banaya class ka initilize size
//         this.size = 0;
//     }
//     // node ;- data and next (node in form of class represent)
//     class Node {
//         String data;
//         Node next;

//         // contructor made
//         Node(String data) {
//             this.data = data;
//             this.next = null; // jb bhi naya node bana rahe hai next uska null hoga(starting me node banegi
//              // koyi list nhi)
//              size++;
//         }

//     }

//     // operations to perform on ll(4 opperations)
//     // add- first, last
//     public void addFirst(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head; 
//         head = newNode;

//     }
//     //add -last
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         //travel(trivse)(not update headt so use curr node)
//         Node currNode = head;
//         while(currNode.next != null){
//             currNode = currNode.next;
//         }
//         //jese hi last node pai phoche
//         currNode.next =  newNode;
//     }
//     //print list
//     //null  of java
//     public void printList(){
//         if(head == null){
//             System.out.println("list is empty");
//             return;
//         }
//         Node currNode = head;
//         while(currNode != null){
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }
//         System.out.println("NULL");
//     }
//     ///delete first
//     public void deleteFirst(){
//         //corner cases(notmal case sai alag)
//         if(head == null){
//             System.out.println("the list is empty");
//             return;
//         }
//         size--;
//         head = head.next;
//     }
//     //delete last
//     public void deleteLast(){
//     if(head == null){
//     System.out.println("the lis is empty");
//     return;
//     }
//     size--;
//     if(head.next == null){
//         head = null;
//         return;
//     }
//     //trivse
//     Node secondLast = head;
//     Node lastNode = head.next; //head.next == null (last node bhi null)
//     while(lastNode.next != null){
//         lastNode = lastNode.next;
//         secondLast = secondLast.next;
//     }
//     secondLast.next = null;
//     }
//     //size
//     public int getSize(){
//         return size;
//     }
    


//     public static void main(String args[]) {
//         // linked list ko banana kai liye (apni hi class ki ek object banane padegi)
//         // ll ka object initilize by ll
//         LL list = new LL();
//         list.addFirst("a");
//         list.addFirst("is");
//         list.printList();

//         list.addLast("list");
//         list.printList();
//         list.addFirst("this");
//         list.printList();

//         list.deleteFirst();
//         list.printList();

//      list.deleteLast();
//         list.printList();

//         System.out.println(list.getSize()); //not count null
//         list.addFirst("this");
//         System.out.println(list.getSize());
//     }
// }








//use collectionframework for linked list not write this full code
//for that import package
 //66import java.util.*;
// public class LL {
// public static void main(String args[]){
//     LinkedList<String> list = new LinkedList<String>();
//     list.addFirst("a");
//     list.addFirst("is");
//     System.out.println(list);

//     list.addFirst("this");
//     list.add("list");
//     //add sirf to bhi last me hi add honge
//     System.out.println(list);

//     System.out.println(list.size());
//     //to print list
//     for(int i=0; i<list.size(); i++){
//         //search for any value in list
//         // /if(list.get(i) == value)
//         System.out.print(list.get(i)+"->");

//     }
//     System.out.println("null");
//     //delete first kai liye use remove first
//     list.removeFirst();
//     System.out.println(list);

//     list.removeLast();
//     System.out.println(list);

//     list.remove(3);
//     System.out.println(list);

// }
// }



// reverse a linked list by iterative approch
import java.util.*;
public class LL {
    
    Node head;
    private int size; //variable for size sath kai sath bhi track kar sakte hai size ko
    LL(){  //constructor banaya class ka initilize size
        this.size = 0;
    }
    // node ;- data and next (node in form of class represent)
    class Node {
        String data;
        Node next;

        // contructor made
        Node(String data) {
            this.data = data;
            this.next = null; // jb bhi naya node bana rahe hai next uska null hoga(starting me node banegi
             // koyi list nhi)
             size++;
        }

    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head; 
        head = newNode;

    }
    //add -last
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        //travel(trivse)(not update headt so use curr node)
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        //jese hi last node pai phoche
        currNode.next =  newNode;
    }
    //print list
    //null  of java
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
             return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
        
    }
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //uper wale kam
         Node newHead = reverseRecursive(head.next);
         head.next.next = head;
         head.next = null;
         return newHead;

    }


public static void main(String args[]) {
        LL list = new LL();
        list.addFirst("this");
        list.addLast("is");
        list.addLast("a");
        list.addLast("book");
        list.printList();
         list.head = list.reverseRecursive(list.head);
        list.printList();
}
}




