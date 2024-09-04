import java.util.*;
 class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode( int val, ListNode next){this.val = val; this.next = next;}

}
  

//public class Solution {

// public ListNode removeNthFromEnd(ListNode head, int n){
//  //ll kai ander ek hi node 
//  if(head.next == null){
//     return null;
//  }
//  //size of th ll
//  int size = 0;
//  ListNode curr = head;
//  while(curr != null){
//     curr = curr.next;
//     size++;
//      }
//      if(n == size){
//         return head.next;
//      }
//      //previous node nikala last sai nth node ki prveious
//      int indexToSearch = size - n; //prev node nikal rahe hai
//     ListNode prev = head;
//     int i = 1;
//      while(i < indexToSearch){
//         prev = prev.next;
//         i++;
//      }
//      //bich wali node ko kat diya
//      prev.next = prev.next.next;
//      return head;
// }
// }


//que2. check ll is palindromic or not(aghe piche dono sai same dikhe)

//  public class LL2{
//     //complete two funtion find middle and reverse ll
//     public ListNode reverse(ListNode head){
//         ListNode prev = null;
//         ListNode curr = head;
//         while(curr != null){
//             ListNode next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
         
//     }
//     public ListNode findMiddle(ListNode head){
//         ListNode hare = head;
//         ListNode turtle = head;
//         while(hare.next != null && hare.next.next != null){
//             hare = hare.next.next;
//             turtle = turtle.next;
//         }
//         return turtle;

//     }
//     public boolean isPalindrome(ListNode head){
//         //check ll khali ya uske ander ek hi element
//         if(head == null || head.next == null){
//             return true;
//         }
//         //find ll middle
//         ListNode middle = findMiddle(head); //1st half ka end
//         ListNode secondHalfStart = reverse(middle.next); 
//         //comparision
//         ListNode firstHalfStart = head;
//         while(secondHalfStart != null){
//             if(firstHalfStart.val != secondHalfStart.val){
//                 return false;
//             }
//             firstHalfStart = firstHalfStart.next;
//             secondHalfStart = secondHalfStart.next;
//         }
//         return true;
//     }
    

//     }




//Que 3.detecting or cycle in linked list
// public class LL2{
//     public boolean hasCycle(ListNode head){
//         //if ll is null
//         if(head == null){
//             return false;
//         }
//         ListNode hare = head; //fast
//         ListNode turtle = head; //slow
//         while(hare.next != null && hare.next != null){
//             hare = hare.next.next;
//             turtle = turtle.next;
//             if(hare == turtle){
//                 return true;
//             }
//          }
//          return false;
//     } 
//}
//Que4    detect cycle and remove

// for remove loop find starting point
