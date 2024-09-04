import java.util.ArrayList;
import java.util.Collections;
// import java.util.*;

public class ArrayLists {
   //list kai ander integers
 public static void main(String args[]){
    //Arraylist ko define
    //arraylist objects ki hogi (to store integer no)not int use -integer class use for arraylist
    //Integer|Float|String|Boolean
    ArrayList<Integer> list = new ArrayList<Integer>();
   // ArrayList<String> list2 = new ArrayList<String>(null);
    //ArrayList<Boolean> list3 = new ArrayList<Boolean>();


    //operation perform add elements (on integers)
    list.add(0);
    list.add(2);
    list.add(3);
    System.out.println(list);

    //get elements
    int element = list.get(0);
    System.out.println(element);

    //to add element in between
    list.add(1, 1);
    System.out.println(list);

    //set element
    list.set(0,5);
    System.out.println(list);
    
    //delete element
    list.remove(3);
    System.out.println(list);
    
    //return size of arraylist
    int size = list.size();
    System.out.println(size);
    
    //iterate/loops
    for(int i=0; i<list.size(); i++){
      System.out.print(list.get(i));
    }
    System.out.println();

    //sorting(in arraylist ek function sai ascending order me sort not code from base)
    Collections.sort(list); //this function not for array
    System.out.println(list);


 }   
}
