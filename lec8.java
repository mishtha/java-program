import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class lec8 {
//Que1. enter 3 numbers from the user and make a function to print their average
// public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt(); 
//    int c = sc.nextInt();

//    int average = (a + b + c)/3;
//    System.out.println(average);

//
//Que2. write a function to print the sum of all odd numbers from 1 to n
// public static void printSum(int n){
//     int sum = 0;
//     for(int i=0; i<=n; i++){
//         if(i % 2 != 0){
//             sum = sum + i;

//         }
//     }
//     System.out.println(sum);
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     printSum(n);
// }


//Que3. write a function which takes in 2 numbers and returns the greater of those two
// public static int getGreater(int a,int b){
//     if(a > b){
//         return a;
//     } else {
//         return b;
//     }
// }
// public static void main(String args[])
// {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     System.out.println(getGreater(a,b));


//Que4. write a function that takes in the radius as input and returns the circumference of a circle.
// public static Double getCircumference(Double radius){
//     return 2 * 3.14*radius;
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     Double radius = sc.nextDouble();
//     System.out.println(getCircumference(radius));


//Que5. write a function that takes in age as input and returns if that person is eligible to vote or not. 
//A person of age>18  is eligible to vote.
// public static boolean isElligible(int age){
//     if(age > 18) {
//         return true;
//     } else{
//     return false;
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int age = sc.nextInt();

//     System.out.println(isElligible(age));

 
//Que6. Write an infinite loop using do while condition.
// public static void main(String args[]){
//     do{

//     } while(true);

// Que7. Write a program to enter the numbers till the user wants and at the end it should display the count of
// positive,negative and zeros entered
// public static void main(String args[]){
//     int positive = 0, negative = 0, zeros = 0;
//     System.out.println("press 1 to continue & 0 to stop");
//     Scanner sc = new Scanner(System.in);
//     int input = sc.nextInt();
//     while(input == 1){
//         System.out.println("Enter your number:");
//         int number = sc.nextInt();
//         if(number > 0 ){
//             positive++;
//         }else if(number < 0){
//             negative++;
//         }else {
//             zeros++;
//         }
//         System.out.println("press 1 to continue & 0 to stop");
//         System.out.println("positives:"+ positive);
//         System.out.println("Zeros :"+zeros);


// Que8. Two numbers are entered by the user,x and n. 
//write a function to find the value of one number raised to the power of another i.e.x^n
// public static void main(String args[]){
//     System.out.println("Enter x");
//     Scanner sc = new Scanner(System.in);
//     int x = sc.nextInt();
//     System.out.println("Enter n");
//     int n = sc.nextInt();
//     int result = 1;
//     //please see that n is not too large or else result will exceed the size of int 
//     for(int i=0; i<n; i++){
//         result = result * x;
//     }
//     System.out.println("x to the power n is:"+result);


//Que9. write a function that  calculates the greatest common divisor of 2 numbers
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n1 = sc.nextInt();
//     int n2 = sc.nextInt();
//     while(n1 != n2) {
//         if(n1>n2){
//             n1 = n1 - n2;
//         } else {
//             n2 = n2-n1;
//         }
//     }
//     System.out.println("GCD is :"+ n2);


//Que10. write a program to print fibonacci series of n terms where n is input by user;
//0 1 1 2 3 5 8 13 21
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int a = 0, b = 1;
//     System.out.print(a+" ");
//     if(n > 1) {
//         //find nth term
//         for(int i=2; i<=n; i++) {
//             System.out.print(b+" ");
//             // the concept below is called swapping
//             int temp = b;
//             b = a + b;
//             a = temp;
//         }
//         System.out.println();
    // }
//}
//}


//Que3. sudoku solver rules 1-9 once in row,column and grid (3*3) (old mob)
public boolean isSafe(char[][] board, int row, int col, int number){
    //row n col
    for(int i=0; i<board.length; i++){
        if(board[i][col] == (char)(number + '0')){
            return false;
        }
        if(board[row][i] == (char)(number + '0')){
            return false;
        }
    }
    //grud
    int sr = (row/3)*3;
    int sc =(col/3)*3;
    for(int i=sr; i<sr+3; i++){
        for(int j=sc; j<sc+3; j++){
            if(board[i][j] == (char)(number + '0')){
                return false;
            }
        }
    }
       return true;

}
public boolean helper(char[][] board, int row, int col){
    if(row == board.length){
        return true;
    }
    int nrow = 0;
    int ncol = 0;
    if(col != board.length-1){
        nrow = row;
        ncol = col+1;
    }else{
        nrow = row +1;
        ncol = 0;
    }
    if(board[row][col] != '.'){
       if(helper(board, nrow, ncol)){
         return true;
        }
    } else{
        for(int i=1; i<=9; i++){
            if(isSafe(board, row, col, i)){
                 board[row][col] = (char)(i+'0');
                 if(helper(board,nrow, ncol)){
                    return true;
                 } else{
                    board[row][col] = '.';
                 }
                
            }
        }
    }
    return false;
}
public void solveSudoku(char[][] board){
    helper(board, 0, 0);
}
}



    








