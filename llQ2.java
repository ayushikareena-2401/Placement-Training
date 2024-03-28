//REVERSE A DOUBLY LINKED LIST.

import java.io.*;
import java.util.*;

class llQ2 {
  static node head;

  static class node {
    int val;
    node next;
    node prev;
    node(int val) {
      this.val=val;
      this.next=null;
      this.prev=null;
    }
  } 

  public static llQ2 insert(llQ2 list,int val) {
    node n = new node(val); 
    if(list.head==null) {
      head=n;
    } else {
      node temp=list.head;
      while(temp.next!=null) {
         temp=temp.next;
      }
        n.prev=temp;
        temp.next=n;
    }
     return list;
  }

  public static void reverse(llQ2 l) {
     node temp=null;
     node current=l.head;
     while(current!=null) {
       temp=current.prev;
       current.prev=current.next;
       current.next=temp;
       current=current.prev;
     }
      if(temp!=null) {
         l.head=temp.prev;
      }
  }
  public static void print(llQ2 l){
    node t=l.head;
    while(t!=null) {
      System.out.print(t.val+" ");
      t=t.next;
    }
  }

  public static void main(String[] a) {
    llQ2 li = new llQ2();
    li=insert(li,1);
    li=insert(li,2);
    li=insert(li,3 );
    System.out.println("The elements of the above mentioned linkedlist :");
    print(li);
    System.out.println("");
    reverse(li);
    System.out.println("The elements of the linked list after reversal :");
    print(li);
  }
}