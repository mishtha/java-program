//  import java.util.*;
// public class BSTSearch {
//     static class Node{
//         int data ;
//         Node left;
//         Node right;
//         Node(int data){
//         this.data = data;
//          }
//     } 
//     public static Node insert(Node root, int val){
//         if(root == null){
//          root = new Node(val);
//         return root;
//         }
//         if(root.data > val){
//             //left subtree
//         root.left = insert(root.left, val);
//         }
//         else{
//         root.right = insert(root.right, val);
//           }
//           return root;
//         }
//         public static void inorder(Node root){
//             if( root == null){
//                 return;
//             }
//             inorder(root.left);
//             System.out.println(root.data+" ");
//             inorder(root.right);
//         }
    
//     public static void main(String args[]){
//         int values[] = {5, 1, 3, 4, 2, 7};
//         Node root = null;
//         for(int i=0; i<values.length; i++){
//             root = insert(root, values[i]);
//         }
//     }
// }


//Que1. Search in bst key = 1
import java.util.*;
public class BSTSearch {
    static class Node{
        int data ;
        Node left;
        Node right;
        Node(int data){
        this.data = data;
         }
    } 
    public static Node insert(Node root, int val){
        if(root == null){
        root = new Node(val);
        return root;
        }
        if(root.data > val){
            //left subtree
        root.left = insert(root.left, val);
        }
        else{
        root.right = insert(root.right, val);
          }
          return root;
        }
        public static void inorder(Node root){
            if( root == null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
        public static boolean search(Node root, int key){
            if(root == null){
                return false;
            }
            if(root.data > key){
                //left subtree
                return search(root.left,key);
            }
            else if(root.data == key){
                return true;
            }
            else {
                return search(root.right,key);
                
            }
        }
        public static Node delete(Node root, int val){
            //search kar rahe ki kis node ko delete kar rahe hai
            if(root.data > val){
             root.left = delete(root.left, val);
            }
            else if(root.data < val){
            root.right = delete(root.right, val);
            }
            else{//root.data == val
                //case1 jisko delete karna hai
                if(root.left == null && root.right == null){
                    return null;
                }
                //case2
                if(root.left == null){
                    return root.right;
                }
                else if(root.right == null){
                    return root.left;
                }
                //case3
              Node IS = inorderSuccessor(root.right);
              root.data = IS.data;
              root.right = delete(root.right, IS.data);
            }
            return root;
        }
        public static Node inorderSuccessor(Node root){
            //jb tak left most child ni mil jata 
            while(root.left != null){
                root = root.left;
            }
            return root;
        }
        //Que2. print in given range
        public static void printInRange(Node root, int X, int Y){
            if(root == null){
                return;
            }
            //case 1 dono kai bich lie karta hai
            if(root.data >= X && root.data <= Y){
                printInRange(root.left, X, Y);
                System.out.print(root.data+" ");
                printInRange(root.right, X, Y);

            }
            //case2
           else if(root.data >= Y){
            printInRange(root.left, X, Y);
             }
             else{
                printInRange(root.right, X, Y);
             }
        }


        //Que3 print paths form root to leaf
        public static void printPath(ArrayList<Integer>path){
            for(int i=0; i<path.size(); i++){
                System.out.print(path.get(i)+"->");
            }
            System.out.println();
        }
        public static void printRoot2Leaf(Node root, ArrayList<Integer>path){
            //base case
            if(root == null){
                return;
            }
            path.add(root.data);
            //leaf node ki condition
            if(root.left == null && root.right == null){
                printPath(path);
            }else{//non-leaf nodes
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
            }
            path.remove(path.size()-1);
        }
    
    public static void main(String args[]){
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        // if(search(root,1)){
        //     System.out.println("found");
        // }else{
        //     System.out.println("not found");
        // delete(root, 4);
        // inorder(root);
        // printInRange(root, 6, 10);
        printRoot2Leaf(root, new ArrayList<>());
        }
    }



