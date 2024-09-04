 import java.util.*;
 public class function {
//     //function declare
//    public static void printMyName(String name) {
//     System.out.println(name);
//     return;
//    }
// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     String name = sc.next();
    
//     printMyName(name); // call the  function
// }
    
// }


//Que2.Make the funtion add 2 nos and return the sum
 
// public static int calculateSum(int a,int b){
//     int sum = a + b ;
//     return sum;
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     int sum = calculateSum(a,b);
//     System.out.println(sum);

// }
//  }

//Que3. make the function multiply 2 no and return the product 
 
// public static int calculateProduct(int a,int b){
//     return a * b;
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     System.out.println("Product of 2 numbers is ;"+ calculateProduct(a,b) );
// }
//  }


//Que4. find the factorial of number
public static void printFactorial(int n){
    //loop
    if(n < 0){
        System.out.println("invalid number");
        return;
    }
    int factorial = 1;
    for(int i=n; i>=1; i--){
        factorial = factorial * i;
    }
    System.out.println(factorial);
    return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printFactorial(n);

    }
}

    