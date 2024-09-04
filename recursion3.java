import java.util.ArrayList;

public class recursion3{
// public static int countPaths(int i, int j, int n, int m){
//     if(i == n || j == m){
//         return 0;
//     }
//     if(i == n-1 && j == m-1){
//         return 1;
//     }
//     //move downwards
// int downPaths = countPaths(i+1, j, n, m);

// ////move
// int rightPaths = countPaths(i, j+1, n, m);
// return downPaths + rightPaths;
// }
// public static void main(String args[]){
//     int n = 3, m = 3;
//     int totalPaths = countPaths(0, 0, n, m);
//     System.out.println(totalPaths);

// }
// }

//Que3. Place tiles of size 1*m in a flooor of size n*m
// public static int placeTiles(int n, int m){
//     if(n == m){
//         return 2;
//     }
//     if(n < m){
//         return 1;
//     }
//      //if tile  vertically placed
//     int vertPlacements = placeTiles(n-m, m);
//     //if tile horizontall placed
//     int horPlacements = placeTiles(n-1, m);
//     return vertPlacements+horPlacements;
// }
// public static void main(String args[]){
//  int n = 4, m = 2;
//  System.out.println(placeTiles(n, m));
// }
// }

//Que4. find the number of ways in which you can invite n people to your party,single or in pairs
// public static int callGuests(int n){
//     if(n <= 1){
//         return 1;
//     }
//     //single tarika
//     int ways1 = callGuests(n-1);
//     //pair tarika
//     int ways2 = (n-1) * callGuests(n-2);
//     return ways1 + ways2;
// } 
// public static void main(String args[]){
//   int n = 4;
//   System.out.println(callGuests(n));
// }
// }

//Que5. print all the subsets of a set pf firest n natural numbers
public static void printSubset(ArrayList<Integer> subset){
    for(int i=0; i<subset.size(); i++){
    System.out.print(subset.get(i)+" ");
}
    System.out.println();
    }
public static void findSubsets(int n, ArrayList<Integer> subset){
    if(n == 0){
        printSubset(subset);
        return;
    }
    // element add hoga to
    subset.add(n);
    findSubsets(n-1, subset);
    //element add nhi hoga
    subset.remove(subset.size()-1);
    findSubsets(n-1, subset);
}
public static void main(String args[]){
int n = 3;
//subset ko array list me store
ArrayList<Integer> subset = new ArrayList<>();
findSubsets(n, subset);
}
}