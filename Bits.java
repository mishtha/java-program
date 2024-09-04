import java.util.*;
public class Bits {
    public static void main(String asrgs[]){
        /// get bit example and gate
        // int n = 5; // 0101
        // int pos = 2;
        // int bitMask = 1<<pos ;
        // if((bitMask & n) == 0){
        //   System.out.println("bit was zero");
        // } else{
        //     System.out.println("bit was one");
        // }

        ///set bit example or gate and and o=not gate
        // int n = 5; // 0101
        // int pos = 1;
        // int bitMask = 1<<pos ;
        // int newNumber = bitMask | n ;
        // System.out.println(newNumber);


        // clear bit example
        // int n = 5; // 0101
        //  int pos = 2;
        //  int bitMask = 1<<pos ;
        //  int notbitMask = ~(bitMask);
        //  int newNumber = notbitMask & n ;
        // System.out.println(newNumber);

        //update bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1 ; set / oper=0 : clear
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
       if(oper == 1){
        //set
       int newNumber = bitMask | n ;
        System.out.println(newNumber);
       } else {
        int newbitMask = ~(bitMask);
        int newNumber = newbitMask & n;
        System.out.println(newNumber);

       }


    }
    
}
