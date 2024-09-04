import java.util.*;
public class Hashing1 {
    public static void main(String args[]){
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();
        //insertion
        map.put("India", 120);
        map.put("Us",30);
        map.put("China", 150);
        System.out.println(map);

        map.put("china", 180); //update new value

        //search
        if(map.containsKey("Indonesia")){
            System.out.println("key is present in the map");
        } else{
            System.out.println("key is not present in the map");
        }
        System.out.println(map.get("China"));  //key exist
        System.out.println(map.get("Indonesia")); //key not exist

        //iteration
    //     int arr[] = {12, 15, 18};
    //     //first way
    //     for(int i=0; i<3; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();

    //     //2nd way
    //  for(int val :arr){
    //     System.out.print(val + " ");
    //  }
    //   System.out.println();

    //iteration in hashmap 1st way through entry set
    for(Map.Entry<String, Integer> e : map.entrySet()){
      System.out.println(e.getKey());
      System.out.println(e.getValue());
    }
    //2nd way through keyset
    Set<String> keys = map.keySet();
    for(String key : keys){
        System.out.println(key+" " + map.get(key));
    }

    //remove
    map.remove("China");
    System.out.println(map);

    }
}
