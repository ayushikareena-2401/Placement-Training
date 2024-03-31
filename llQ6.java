//REMOVE ALL THE OCCURANCEOF ONE LIST FROM THE OTHER.

import java.io.*;
import java.util.*;

class llQ6 {

  static class node {
     int val;
     node next;
     node(int val) {
      this.val=val;
      this.next=null;
     }
  }
  

public static void op(node h1,node h2) {
  ArrayList<Integer> list1 = new ArrayList<Integer>();
   node temp=h1;  
  while(temp!=null) {
    list1.add(temp.val);
    temp=temp.next;
  }
  node temp1=h2;
   while(temp1!=null) {
     if(!list1.contains(temp1.val)) {
       System.out.println(temp1.val+" ");
     }
     temp1=temp1.next;
  }
}

public static void main(String[] a) {
  node head = new node(1);
  head.next = new node(2);
  head.next.next = new node(3);
  head.next.next.next = new node(4);
  head.next.next.next.next = new node(5);

  node head1 = new node(1);
  head1.next = new node(2);
  head1.next.next = new node(6);

  op(head,head1);
 }
}