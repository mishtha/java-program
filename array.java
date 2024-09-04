import java.util.*;
public class array {
//     public static void main(String args[]){
//         //int[] marks = new int[3]; or
//         //int marks[] = new int[3];
//         // marks[0] = 97; //pys
//         // marks[1] = 98; //chem
//         // marks[2] = 96; //math
//         // 2nd way where already know the size of array
//         int marks[] = {97,98,96};
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         //2nd method
 
//         for(int i=0; i<3; i++){
//             System.out.println(marks[i]);
//         }
//     }
    
// }


//next questions
//  public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();
//     int numbers[] = new int [size];

//     //input
//     for(int i=0; i<size; i++){
//        numbers[i] = sc.nextInt();
//     }
//     //output
//     for(int i=0; i<size; i++){
//         System.out.println(numbers[i]);



//Que3. take an array as input from the user .search for a givennumber xand print the index  at which its occur
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();
//     int numbers[] = new int [size];

//     //input
//     for(int i=0; i<size; i++){
//         numbers[i] = sc.nextInt();
//     }
//     int x = sc.nextInt();
//     //output
//     for(int i=0; i<numbers.length; i++){
//         if(numbers[i] == x){
//             System.out.println("x found at index:"+ i);
//         }


//homework
//Que4. take an array of names as input from the user and print them on the screen
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String names[] = new String[size];

    //input
    for(int i=0; i<size; i++){
        names[i] = sc.next();
    }
    //output
    for(int i=0; i<names.length; i++){
        System.out.println("name" +(i+1) +"is:" + names[i]);
    }
}
    }




    
 
 
