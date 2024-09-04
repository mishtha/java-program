//public //class pen{
    //     //blue print of pen or class
    //     String color;
    //     String type; //ballpoint; gel
    
    //     //methods or functions that define in class
    //     public void write(){
    //         System.out.println("writing something");
    //     }
    //     //another method of print color and type of pen(this is key word of java sow ish function ko kis object nai call kiya hai)
    //     public void printColor(){
    //         System.out.println(this.color);
    //     }
    // }
    
    
    // //ojects main structure main me banta hai
    // public class OOps {
    //     public static void main(String args[]){
    //         Pen pen1 = new Pen(); //made pen(object banaya)
    //         //properties by (.)
    //         pen1.color = "blue";
    //         pen1.type = "gel";
    
    //         Pen pen2 = new Pen();
    //         pen2.color = "black";
    //         pen2.type = "ballpoint";
    
    
    //         //call the method or function
    //         pen1.printColor();
    //         pen2.printColor();
    //     }
    // }
    
    
    // 2. concept
    // class Student{
    //   String name;
    //   int age;
    //   public void printInfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    //   }
    // 1.type non paratermized constructor(not return type)
    //   Student(){
    //  System.out.println("constructor called");
    //   }
    
    // }
    // public class OOps{
    //     //(new keyword is used (memory kai ander ek jagah allot and obj store there)
    //     //student(); is also a function known as constructors
    //     // constructors means objects ko construct karna
    //     //3properties 3types
    //     
    //     public static void main(String args[]){
    //         Student s1 = new Student();
    //         s1.name = "dharmishtha";
    //         s1.age = 24;
    //         s1.printInfo();
    //     }
    // }
    
    //2.type  parameterized 
    // class Student{
    //   String name;
    //   int age;
    //   public void printInfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    //   }
    //   //constructor//
    //   Student(String name, int age){  //here name is parameter
    //     this.name = name; //here this.name is object name
    //     this.age = age; //initiliaze here 
    //   }
    //   }
    // public class OOps{
    //   public static void main(String args[]){
    //         Student s1 = new Student("Dharmishtha", 21);  //pass age and name here 
           
    //         s1.printInfo();
    //     }
    // }
    
    
    //3.type copy constructors (define in java by users here ek obj ko copy karke dusre obj e dal dete hai)
    // class Student{
    //   String name;
    //   int age;
    //   public void printInfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    //   }
    //   //constructor// //copy cons
    //   Student(Student s2){  
    //     this.name = s2.name; 
    //     this.age = s2.age; 
    //   }
    //   Student(){
    
    //   }
    //   }
    // public class OOps{
    //   public static void main(String args[]){
    //         Student s1 = new Student();
    //         s1.name = "dharmishtha";
    //         s1.age = 21;
    //         Student s2 = new Student(s1);
           
    //         s2.printInfo();
    //     }
    // }
    
    
    // 4concepts of oops
    //  1. polymorphism(function overloading compile time poly)
    // class Student{
    //   String name;
    //   int age;
    //   public void printInfo(String name){
    //     System.out.println(name);
    //   }
    //   public void printInfo(int age){
    //     System.out.println(age);
    //   }
    //   public void printInfo(String name, int age){
    //     System.out.println(name + " " + age);
    //   }
    // }
    // public class OOps{
    //   public static void main(String args[]){
    //     Student s1 = new Student();
    //     s1.name = "dharmishtha";
    //     s1.age = 21;
    //     s1.printInfo(s1.name,s1.age);
    //    }
    // }
    
    //2. concept inheritance
    // class Shape{
    //   String color;
    //   }
    // class Triangle extends Shape{ //triangle class nai inherit kar liya shape class ki properties ko
    // }
    
    // public class OOps{
    //   public static void main(String args[]){
    //     Triangle t1 = new Triangle();
    //     t1.color = "red";
    
    //   }
    // }
    // inheritance have four types in java
    
    // 1.type is single level inheritance(base class --> derived class)
    
    // class Shape{
    //   public void area(){
    //     System.out.println("displays area");
    //   }
    // }
    // class Triangle extends Shape{
    //   public void area(int l, int h){
    //     System.out.println(1/2*l*h);
    //   }
    // }
    // public class OOps{
    //   public static void main(String args[]){
    
    //   }
    // }
    
    // 2.type is multi level inheritance(base class--> derived class--> derived class-->)
    // class Shape{ //base class
    //   public void area(){
    //     System.out.println("display area");
    //   }
    // }
    // class Triangle extends Shape{
    //   public void area(int l, int h){
    //     System.out.println(1/2*l*h);
    //   }
    // }
    // class EquilateralTriangle extends Triangle{
    //   public void area(int l, int h){
    // }
    // }
    // public class OOps{
    //   public static void main(String args[]){
    
    //   }
    // }
    
    // 3.type hierarchial inheritance
    // class Shape{
    //   public void area(){
    //     System.out.println("display area");
    //   }
    // }
    // class Triangle extends Shape{
    //   public void area(int l, int h){
    //     System.out.println(l/2*l*h);
    //   }
    // }
    // class Circle extends Shape{
    //   public void area(int r){
    //     System.out.println((3.14)*r*r);
    //   }
    // }
    // public class OOps{
    //   public static void main(String args[]){
    
    //   }
    // }
    
    // 4.type hybrid inheritence(include all above inheritance)
    
    // package concept
    // import java.util.*;
    // import bank;//bank name kai package ki public chije import kar liya
    // class Shape{
    //   public void area(){
    //     System.out.println("display area");
    //   }
    // }
    // class Triangle extends Shape{
    //   public void area(int l, int h){
    //     System.out.println(l/2*l*h);
    //   }
    // }
    // class Circle extends Shape{
    //   public void area(int r){
    //     System.out.println((3.14)*r*r);
    //   }
    // }
    // public class OOps{
    //   public static void main(String args[]){
    //     bank.Account account1 = new bank.Account();
    //     account1.name = "customer1";
    
    //   }
    //}
    
    
    // /abstraction concept
    //  abstract class Animal{ //animal class onlly exist but actually not use non relevent class will abstract 
    //   //iske ander  ki kuch properties ko hum abstract bana sakte hai
    //   abstract void walk(); //function ko bhi abstract semicolon sai end kar sakte hai
    //   //property4
    //   Animal(){
    //     System.out.println("You are creating a new Animal");
    //   }
    //   public void eat(){
    //     System.out.println("Animal east");
    //   }
    
    //   }
    
    // class Horse extends Animal{
    //     //prop4
    //     Horse(){
    //         System.out.println("Created a Horse");
    //     }
    //   public void walk(){
    //     System.out.println("walks on 4 legs");
    //   }
    // }
    // class Chicken extends Animal{
    //   public void walk(){
    //     System.out.println("walks on 2 legs");
    //   }
    // }
    // public class OOps{
    //   public static void main(String args[]){
    //    Horse horse = new Horse();
    //   // horse.walk();
    // //    Animal animal = new Animal();
    // //    animal.walk();  (animal actually not exist here is run time have error)
    //    // horse.eat();
    //   }
    // }
     

    // abstraction (for pure abstraction use interfaces)
    // interface Animal{
    //     int eyes = 2; //static variable
    //     void walk(); //abstarct and public both by default
    
    // }
    // interface Herbivore{

    // }
    // class Horse implements Animal, Herbivore{ //multiple inheritance(not by classes) by interfaces in java
    //      public void walk(){ 
    //         System.out.println("walks on 4 legs");
    //     }
    // }
    // public class OOps{
    //     public static void main(String args[]){
    //         Horse horse = new Horse();
    //         horse.walk();
    //     }
    // }



    // static word concept
    class Student{
        String name;
        static String school; //pure studensts object class ki school mka name same karne kai liye static laga diya
        public static void changeSchool(){
            school = "newschool";
        }
    }

    public class OOps{
        public static void main(String args[]){
            Student.school = "JMV";
            Student student1 = new Student();
            student1.name = "tonny";
            System.out.println(student1.school);
        }
    }