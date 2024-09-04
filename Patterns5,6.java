// import java.until.*;
// import java.util.regex.Pattern;
//  public class Patterns {
//      public static void main(String args[]){
//         // nested loops concept
//         // int n = 4;
//         // int m = 5;
       
//         // //outer loop
//         // for(int i=1; i<=n; i++){
//         //     //inner loop
//         //     for(int j=1; j<=m; j++){
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();

//     // Que2. print the Pattern    hollow rectangle
//     // *****
//     // *   *
//     // *   *
//     // *****    
//     // int n = 4;
//     // int m = 5;
//     // //outer loop
//     //   for(int i=1; i<=n; i++){
//     //     //inner loop
//     //     for(int j=1; i<=m; j++){
//     //         //cell-> (i,j)
//     //         if(i == 1 || j == 1 || i == n || j == m){
//     //             System.out.print("*");
//     //         } else {
//     //             System.out.println(" ");
//     //         }
//     //     }
//     //      System.out.println();
      




//     }

    
// }
// Que3 print the pattern   half pyramid
// *
// **
// ***
// ****



//   int n = 4;
//     //outer loop
//     for(int i=1; i<=n; i++) {
//         //inner lo    iop
//         for(int j=1; j<=i; j++) {
//             System.out.print("*");
            
//         }
//         System.out.println();

//Que4. pthep inverted half pyramid
//   int n = 4;
//   //outer loop
//     for(int i=n; i>=1; i--) {
//     //inner loop
//     for(int j=1; j<=i; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }

//Que5. pthep Inverted half pyramid (rotated by 180 deg)
    //     *    3 space+ 1 srtar
    //    **    2 space +2 star
    //   ***    1 space + 3 star
    //  ****    0 space+4 star} n=4
    // int n = 4;
    // //outer loop
    // for(int i=1; i<=n; i++) {
    //     //inner loop space print
    // for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //  }
    //  //inner loop
    //  for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //  }
    //  System.out.println();
    // }
// Que6. print the Pattern
//  1
//  1 2
//  1 2 3
//  1 2 3 4
//  1 2 3 4 5 
//   int n = 5;
//   //outer loop
//   for(int i=1; i<=n; i++){
//     //inner loop
//     for(int j=1; j<=i; j++){
//         System.out.print(j+" ");
//     }
//     System.out.println();

// Que7. print the Pattern
// 1 2 3 4 5  r=1 j= 1to 5
// 1 2 3 4    r=2 j= 1to 4
// 1 2 3      r=3 j= 1to 3
// 1 2
// 1
//  int n = 5;
//  // outer loop
//  for(int i=1; i<=n; i++){
//     //inner loop
//     for(int j=1; j<=n-i+1; j++) {
//         System.out.print(j);
//     }
//      System.out.println();


// Que8. print the Pattern
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
//  int n = 5;
//  int number = 1;
//  //outer loop
//  for(int i=1; i<=n; i++){
//     //inner loop
// for(int j=1; j<=i; j++){
//     System.out.print(number+" ");
//     number++; //number++=number+1
// }
// System.out.println();


//Que9. print the Pattern 01 triangle
// 1
// 0 1
// 0 1 0
// 1 0 1 0
// 1 0 1 0 1
  
// int n = 5;
// //outer loop
// for(int i=1; i<=n; i++){
//     //inner loop
// for(int j=1; j<=i; j++){
//     int sum = i+j;
//     if(sum % 2 == 0) {  //even
//         System.out.print("1 ");
//     } else { //odd
//         System.out.print("0 ");
        
//     }
// }
// System.out.println();


//Que10. print the Pattern butterfly pattern
//  int n = 5 ;
 //upper  half
 //outer loop
//  for(int i=1; i<=n; i++){
//     //first part
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     //spaces
//     int spaces = 2 * (n-i);
//     for(int j=1; j<=spaces; j++){
//         System.out.print(" ");
//     }
//     //2nd part
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
 //}
//  //lower half
//  for(int i=n; i>=1; i--){
//     //first part
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     //spaces
//     int spaces = 2 * (n-i);
//     for(int j=1; j<=spaces; j++){
//         System.out.print(" ");
//     }
//     //2nd part
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
    // System.out.println();
//Que11. print the solid rombus Pattern
//   int n = 5;
//   for(int i=1; i<=n; i++){
//     //spaces
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     //stars
//     for(int j=1; j<=5; j++){
//         System.out.print("*");
//     }
//     System.out.println();



// Que12. print the no pyramid
//      1
//     2 2
//    3 3 3
//   4 4 4 4
//  5 5 5 5 5 
//  int n = 5;
//  for(int i=1; i<=n; i++){
//     //spaces
//  for(int j=1; j<=n-i; j++){
//     System.out.print(" ");
//  }
//  //numbers print row number row times
//  for(int j=1; j<=i; j++){
//     System.out.print(i +" ");
//  }
//  System.out.println();
//  }

//Que13. print the pattern
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5 
// int n = 5;
// //outer loop
// for(int i=1; i<=n; i++){
//    // for spaces
//    for(int j=1; j<=n-i; j++){
//     System.out.print(" ");

//    }
//    //first half
//    for(int j=i; j>=1; j--){
//     System.out.print(j);
//    }
//    //2nd half
//    for(int j=2; j<=i; j++){
//     System.out.print(j);
//    }
//    System.out.println();

// //Que14. print the pattern diamond pattern
//  int n = 4;
// //outer loop
// for(int i=1; i<=n; i++){
//     //spaces
//     //inner loop upper half
//     for (int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
// //stars
//    for(int j=1; j<=2*i-1; j++){
//     System.out.print("*");
//    }
//    System.out.println();
// }
// //outer loop
// for(int i=n; i>=1; i--){
//     //spaces
//     //inner loop lower half
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
// //stars
//    for(int j=1; j<=2*i-1; j++){
//     System.out.print("*");
//    }
//    System.out.println();

// }   
//  }
// }

 

 

  
  



    

 