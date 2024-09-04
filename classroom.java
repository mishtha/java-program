import java.util.*;
//Que1. find the majorityElement  that are more than n/3 times 
public class classroom {
//     public static void majorityElement(int nums[]){
//         //1step create an hashmap
//       HashMap<Integer, Integer> map = new HashMap<>();
//       //step2 loop sai sari values and keys pairs ko form
//       int n = nums.length;
//       for(int i=0; i<n; i++){
//         if(map.containsKey(nums[i])){//true
//             map.put(nums[i], map.get(nums[i] + 1));
//          }else{// false
//          map.put(nums[i],  1);
//       }  

//     }
//     //3rd step(set of numbers that are more than n/3times)
//     for (int key : map.keySet()){
//       if(map.get(key) > n/3){
//         System.out.println(key);
//       }
//     }
// }

//     public static void main(String args[]) { // O(n)
//         int nums[] = { 1, 2}; // 1
//           majorityElement(nums);
//     }
// }



 //Que2. find union of two arrays or sets  O(n)
//  public static int union(int arr1[], int arr2[]){
//     HashSet<Integer> set = new HashSet<>();
//     for(int i=0; i<arr1.length; i++){
//       set.add(arr1[i]);
//     }
//     for(int j=0; j<arr2.length; j++){
//       set.add(arr2[j]);
//     }
//     return set.size();
//  }

//Que 3 find the intersection of two arr
//  public static int intersection(int arr1[], int arr2[]){
//   HashSet<Integer> set = new HashSet<>();
//   int count = 0;
//   for(int i=0; i<arr1.length; i++){
//     set.add(arr1[i]);
//   }
//   for(int j=0; j<arr2.length; j++){
//     if(set.contains(arr2[j])){
//       count++;
//       set.remove(arr2[j]);
//     }
//   }
//   return count; //intersection wala count
//  }
//   public static void main(String args[]){
//   int arr1[] = {7, 3, 9};
//   int arr2[] = {6, 3, 9, 2, 9, 4};
//   //System.out.println(union(arr1, arr2));
//   System.out.println(intersection(arr1, arr2));
//  } 
// }


// Que 4 find the itenary --> paths
//this function find starting point
// public static String getStart(HashMap<String, String> tick){
//  HashMap<String, String> revMap = new HashMap<>();
//  for(String key : tick.keySet()){
//   //key > key: val -. tic.get(key)
//   revMap.put(tick.get(key), key);
//  }
//  for(String key : tick.keySet()){
//   if(!revMap.containsKey(key)){
//     return key;
//   }
//  }
//  return null;
// }
// public static void main(String args[]){
//   HashMap<String, String> tickets = new HashMap<>();
//   tickets.put( "Chennai", "Bengluru");
//   tickets.put( "Mumbai", "Delhi");
//   tickets.put( "Goa", "Chennai");
//   tickets.put( "Delhi", "Goa");
//  String start = getStart(tickets);
//  while(tickets.containsKey(start)){
//   System.out.print(start+"->");
//   //update start
//   start = tickets.get(start);
//  }
//  System.out.println(start);
// }

// }


//Que5.. microsoft--> subarray sum equal to k1 

public static void main(String args[]){
  int arr[] = {10, 2, -2, -20, 10}; //ans = 3
  int k = -10;
  HashMap<Integer, Integer> map = new HashMap<>(); //sum, freq
  map.put(0, 1);
  int ans = 0;
  int sum = 0;
  for(int j=0; j<arr.length; j++){
  sum += arr[j];
  if(map.containsKey(sum-k)){
    ans += map.get(sum-k);
  }
  if(map.containsKey(sum)){
    map.put(sum, map.get(sum) + 1);
  }else{
    map.put(sum, 1);
  }
  }
  System.out.println(ans);
}

}    
    

