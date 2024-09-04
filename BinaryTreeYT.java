//que1.   build  a tree and print root node;
// import java.util.*;
// public class BinaryTreeYT {
//     //class for node
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//     //constructor
//     Node(int data){
//      this.data = data;
//      this.left = null;
//      this.right = null;
//     }
// }
// static class BinaryTree{
//     static int idx = -1;
//     public static Node buildTree(int nodes[]){ //  takes all nodes of array and return root of the binary tree
//       idx++;  //-1 sai 0 root introduce
//       if(nodes[idx] == -1){ //-1 represent a null node
//         return null;
//       }
//       Node newNode = new Node(nodes[idx]); //for remaining data create a new node
//       newNode.left = buildTree(nodes);
//       newNode.right = buildTree(nodes);
//       return newNode; //root node return at end
//     }
// }

// public static void main(String args[]){
//     int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//     BinaryTree tree = new BinaryTree(); //make a binary tree
//     Node root = tree.buildTree(node);
//     System.out.println(root.data);

// }
// }

// //travel on binary tree -----> 4 ways ----. 1. preorder traversal

import java.util.*;
//import java.max.*;

public class BinaryTreeYT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }

    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // print root then left subtree then right subtree
    public static void preorder(Node root) {
        if (root == null) {
            return; // also we can write return -1
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // 2nd way to travel ----> inorder traversal ( print --> 1.left subtree 2.root
    // 3.right subtree)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    /// 3. way postorder (print 1.left subtree 2. right subtre 3. root)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // 4. level order traversal(bfs)
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println(); // next line
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }

            }
        }

    }
    //que1. count of nodes in given tree(time cop O(n))
    public static int countOfNodes(Node root){
        if(root == null){ //base case
            return 0;
        }
        int leftNodes = countOfNodes(root.left); //recursion 
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;

    }
    //Que2. sum of nodes in binary tree
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }
    //Que 3. height of a tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }
    //Que4 diameter of tree appproch 1
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;
        return Math.max(diam3, Math.max(diam1, diam2));

    }
    //appproch2
    // static class TreeInfo{
    //     int ht;
    //     int diam;
    //     TreeInfo(int ht, int diam){
    //         this.ht = ht;
    //         this.diam = diam;
    //     }
    // }
    // public static TreeInfo diameter2(Node root){
    //     if(root == null){
    //        return new TreeInfo(0, 0);
    //     }
        
    //     TreeInfo left = diameter2(root.left);
    //     TreeInfo right = diameter2(root.right);
    //     int myHeight = Math.max(left.ht, right.ht) +1;
    //     int diam1 = left.diam;
    //     int diam2 = right.diam; 
    //     int diam3 = left.ht + right.ht +1;
    //     int  mydiam = Math.max(Math.max(diam1, diam2, diam3));
    //     TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
    //     return myInfo;

    // }

    public static void main(String args[]) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree(); // make a binary tree
        Node root = tree.buildTree(node);
        // preorder(root); O(n)
        // inorder(root);O(n)
        // postorder(root);O(n)
        // levelOrder(root);
        // System.out.println(countOfNodes(root));
        // System.out.println(sumOfNodes(root));
        // System.out.println(height(root));
        // System.out.println(diameter(root));
        // System.out.println(diameter2(root).diam);

    }
}
