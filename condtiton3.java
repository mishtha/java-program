import java .util.*;
public class condtiton3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();

    // if(x % 2 == 0){
    //     System.out.println("Even");
        
    // } else{
    //     System.out.println("odd");
    // }
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    
    // if (a == b){
    //     System.out.println("Equal");

    // } else{
    //     if (a > b){
    //     System.out.println("a is greater");
    // } else{
    //     System.out.println("a is lesser");



   // another way of above code

   
//     int a = sc.nextInt();
//     int b = sc.nextInt();
    
//     if (a == b){
//         System.out.println("Equal");

//     } else if(a > b){
        
//         System.out.println("a is greater");
//     }
//     else {
//         System.out.println("a is lesser");
//     }
    
//   }
// }

// switch concept
// int button = sc.nextInt();

// if(button == 1){
//     System.out.println("Hello");
// } else if(button == 2){
//     System.out.println("Namaste");
// } else if(button == 3){
//     System.out.println("Bonjour");
// } else {
//     System.out.println("Invalid Button");

//we don,t use else if not again and again so we use switch

int button = sc.nextInt();
switch(button){
    case 1 : System.out.println("hello");
    break;
    case 2 : System.out.println("Namaste");
    break;
    case 3 : System.out.println("Bonjour");
    break;
    default : System.out.println("Invalid button");
}
}

    }
