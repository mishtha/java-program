import javax.sql.rowset.spi.SyncResolver;

public class Recursion1 {
    /////Que1. print the numbers from 5 to 1
//     public static void printNumb(int n){
//         if(n == 0){// base case
//             return;
//         }
//         System.out.println(n); //print
//         printNumb(n-1);   // recursion khudh kai function ko cll kiya
//     }
//     public static void main(String args[]){
//         int n = 5;
//         printNumb(n); // n = 5
//     }
// }



////Que2. print the numbers from 1 to 5
    //   public static void printNumb(int n){
    //     if(n == 6){//base case
    //     return;
    //   }
    //   System.out.println(n);
    //   printNumb(n+1);     // recursion khudh kai function ko cll kiya
    //   }
    //   public static void main(String args[]){
    //     int n = 1;
    //     printNumb(n);
    //   }
    // }


/// Que3. print the sum of first n natural numbers
///method of solving
// step 1 main function n=1
/// step2 base condition =n(sum print)
///"kam" work calculate sum

// public static void printSum(int i, int n, int sum){
//     if(i == n){
//         sum += i;
//         System.out.println(sum);
//         return;
//     }

//     sum += i;
//     printSum(i+1, n, sum);
//       System.out.println(i);
// }
// public static void main(String args[]){
//     printSum(1, 5, 0);

// }
// }



///Que4. print the factorial of a number n
// public static int calcfactorial(int n){
//       if(n == 1 || n ==0){
//         return 1;
//       }
//      int fact_num1 = calcfactorial(n-1);
//      int fact_n = n * fact_num1;
//      return fact_n;
// }
// public static void main(String args[]){
//     int n = 5;
//      int ans = calcfactorial(n);
//      System.out.println(ans);;
// }
// }


/// Que5. print the fibonacci sequence till nth term(c=a+b)
// public static void printFib(int a, int b, int n){
//     if(n == 0){
//         return;
//     }
//     int c = a + b;
//     System.out.println(c);
//     printFib(b, c, n-1);

// }
// public static void main(String args[]){
//     int a = 0, b = 1;
//     System.out.println(a);
//     System.out.println(b);
//     int n = 7;
//     printFib(a, b, n-2);
// }
// }


///Que6. print x^n(stack height = n)
// public static int calcPower(int x, int n){
//     if(n == 0){
//         return 1; // base case 1
//     }
//     if(x == 0){
//         return 0;  //base case2
//     }
//     int xPownm1 = calcPower(x, n-1); //kaam
//     int xPown = x * xPownm1;
//     return xPown;
// }
// public static void main(String args[]){
//     int x = 2, n = 5;
//     int ans = calcPower(x, n);
//     System.out.println(ans);
// }
// }

///Que7. printx^n(stack height = logn)
// public static int calcPower(int x, int n){
//         if(n == 0){
//             return 1; // base case 1
//         }
//         if(x == 0){
//             return 0;  //base case2
//         }
//         // if n is even
//         if(n % 2 == 0){
//             return calcPower(x , n/2) * calcPower(x , n/2);
//         }
//         else{//n is odd
//         return calcPower(x , n/2) * calcPower(x , n/2) * x;
//     }
//     }
//     public static void main(String args[]){
//         int x = 2, n = 5;
//         int ans = calcPower(x, n);
//         System.out.println(ans);
//     }
//     }