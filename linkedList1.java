//LINKED LIST

import java.io.*;
import java.util.*;

class linkedList1 {
  static node head;
  static class node {
    int val;
    node next;
    node(int val) {
      this.val=val;
      this.next=null;
    }
  } 
  public static linkedList1 insert(linkedList1 list,int val) {
    node n = new node(val); 
    if(list.head==null) {
      head=n;
    } else {
      node temp=list.head;
      while(temp.next!=null) {
         temp=temp.next;
      }
       temp.next=n;
    }
     return list;
  }
  public static void print(linkedList1 l){
    node t=l.head;
    while(t!=null) {
       System.out.print(t.val+" ");
       t=t.next;
    }
  }
  public static void main(String[] a) {
    linkedList1 li = new linkedList1();
    li=insert(li,1);
    li=insert(li,2);
    print(li);
  }
}