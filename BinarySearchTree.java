import java.io.*;
import java.util.*;
import java.lang.Math;

class BinarySearchTree{

  BinarySearchTree() {
  }

 public static class Node {
  int val;
  int height;
  Node left;
  Node right;

  Node(int val) {
   this.val=val;
  }

  public int getValue(){
     return val;
  }
 }

 private static Node root;
  
 public static int height(Node node) {
   if(node==null) {
      return -1;
    }
    return node.height;
 }

 public static void populate(int[] arr){
   for(int i=0;i<arr.length;i++) {
       insert(arr[i]);
   }
 }

 public static void insert(int val) {
   root=insert(root,val);
 }

 public static Node insert(Node node, int val) {
   if(node==null) {
     node = new Node(val);
     return node;
   }
   if(val<node.val) {
     node.left=insert(node.left,val);
   }
    if(val>node.val) {
     node.right=insert(node.right,val);
   }
   node.height=Math.max(height(node.left),height(node.right));
   return node;
 }

 public static void populateSorted(int[] arr,int start,int end){
   if(start>=end) {
       return;
   }
   int mid=start+(end-start)/2;
   insert(arr[mid]);
   populateSorted(arr,start,mid);
   populateSorted(arr,mid+1,end);
 }

 public static void display(Node node,String details) {
   if(node == null) {
     return;
   }
   System.out.println(details+node.val);
   display(node.left,"Left child of "+node.val+":");
   display(node.right,"Right child of "+node.val+":");
 }

public boolean isBalanced(Node root) {
  if (root==null) {
    return true;
  }
  return Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
}

 public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    int[] arr={8,1,4,3,5,9,6};
    int[] arr1={1,2,3,4,5,6,7,8};
   // populate(arr);
    //display(root,"Root Node:");
    populateSorted(arr1,0,7);
    display(root,"Root Node:");
 }
}
