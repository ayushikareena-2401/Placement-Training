//INTERSECTION OFTWO SORTED LINKED LIST.

import java.io.*;
import java.util.*;

class llQ7 {

  static class node {
     int val;
     node next;
     node(int val) {
      this.val=val;
      this.next=null;
     }
  }
  

public static void op(node h1,node h2) {
   node temp=h1;  
   node temp1=h2;
  while(temp!=null && temp1!=null) {
    if(temp.val>temp1.val) {
      System.out.print(temp1.val);
      temp1=temp1.next;
    } else  if(temp.val<temp1.val) {
      System.out.print(temp.val);
      temp=temp.next;
    } else {
      System.out.print(temp1.val);
      temp=temp.next;
      temp1=temp1.next;
    }
  }
  
  while(temp!=null) {
    System.out.print(temp.val);
    temp=temp.next;
  }
   while(temp1!=null) {
     System.out.print(temp1.val);
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