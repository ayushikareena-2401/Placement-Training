//CONVERT SINGLY LINKEDLIST TO CIRCULAR LINKED LIST.

class llQ4 {
  static node head;

  static class node {
     int val;
     node next;
     node(int val) {
      this.val=val;
      this.next=null;
     }
  }
  
 public static llQ4 insert(llQ4 list,int val) {
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

public static void op(llQ4 l,int v) {
  node temp=l.head; 
  while(temp.next!=null) {
   temp=temp.next;
  }  
   temp.next=l.head;
   l.head=temp;
}

public static void print(llQ4 list) {
  node temp=list.head;
  while(temp!=null) {
   System.out.print(temp.val+" ");
   temp=temp.next;
  }
}

public static void main(String[] a) {
  llQ4 l = new llQ4();
  l=insert(l,1);
  l=insert(l,2);
  l=insert(l,3);
  l=insert(l,4);
  l=insert(l,5);
  System.out.println("The given linkedlist:");
  print(l);
  System.out.println();
  System.out.println("The updated linkedlist:");
  op(l,2);
//Sucessfully done if you will try to print the circular linked list using above method you will get into infinite loop.
 // print(l);
 }
}