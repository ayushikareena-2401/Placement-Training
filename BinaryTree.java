import java.io.*;
import java.util.*;

class BinaryTree{

  BinaryTree() {
  }

 public static class Node {
  int val;
  Node left;
  Node right;

  Node(int val) {
   this.val=val;
  }

 }

 private static Node root;

 public static void populate(Scanner sc){
   System.out.println("Enter the value of the  root");
   int val=sc.nextInt();
   root=new Node(val);
   populate(sc,root);
 }

 public static void populate(Scanner sc, Node root) {
   System.out.println("Do you want to enter the value of the left child of the "+root.val);
   boolean left=sc.nextBoolean();
   if(left) {
     System.out.println("Enter the value of the left child");
     int val=sc.nextInt();
     root.left=new Node(val);
     populate(sc,root.left);
   }
   System.out.println("Do you want to enter the value of the right child of the "+root.val);
   boolean right=sc.nextBoolean();
   if(right) {
     System.out.println("Enter the value of the right child");
     int val=sc.nextInt();
     root.right=new Node(val);
     populate(sc,root.right);
   }
 }

 public static void InOrder(Node root){
  if(root==null) {
    return;
  }
  InOrder(root.left);
  System.out.println(root.val);
  InOrder(root.right);
 }

 public static void PreOrder(Node root){
  if(root==null) {
    return;
  }
  System.out.println(root.val);
  PreOrder(root.left);
  PreOrder(root.right);
 }

 public static void PostOrder(Node root){
  if(root==null) {
    return;
  }
  PostOrder(root.left);
  PostOrder(root.right);
  System.out.println(root.val);
 }

 public static void display(Node node,int level) {
   if(node == null) {
     return;
   }
   display(node.right,level+1);
   if(level!=0) {
   for(int i=0;i<level-1;i++) {
       System.out.print("|\t\t");
   }
     System.out.println("|---->"+node.val);
  } else {
      System.out.println(node.val);
  }
   display(node.left,level+1);
 }
 public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    populate(sc);
    System.out.println("The InOrder traversal of the tree:");
    InOrder(root);
    System.out.println("The PreOrder traversal of the tree:");
    PreOrder(root);
    System.out.println("The PostOrder traversal of the tree:");
    PostOrder(root);
    display(root,0);
 }
}
