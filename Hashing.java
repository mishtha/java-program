import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String args[]){
        //creating
        HashSet<Integer> set = new HashSet<>();
        //ArrayList<Integer> set = new ArrayList<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //list.add(element)
        // store only 123 in set  because it store unique eleement in memory

        //size
        System.out.println("size of set is :" + set.size());
        //print all elements of set
        System.out.println(set);

        //Iterator    not this type beacuse there is not any index here for(int i=0; i<n i++) -->use special iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //search - contains
        // if(set.contains(1)){
        //   System.out.println("set contains 1");
        // }
        // if(!set.contains(6)){
        //     System.out.println("does not contain");
        // }

        // //delete
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("does not contain 1");
        // }

    }
}
