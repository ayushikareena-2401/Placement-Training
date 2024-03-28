//DELETE THE LAST OCCURANCE OF A NUMBER.

class llQ3 {
  static node head;

  static class node {
     int val;
     node next;
     node(int val) {
      this.val=val;
      this.next=null;
     }
  }
  
 public static llQ3 insert(llQ3 list,int val) {
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

public static void op(llQ3 l,int v) {
   int ind=-1,c=1;
   node temp=l.head;
   while(temp!=null) {
      if(temp.val==v) {
        ind=c;
     }
    c++;
   temp=temp.next;
   }
  int t=1;
  if(c==1) {
    head=head.next;
  } else {
  node t1=l.head;
  while(t+1!=ind) {
   t++;
   t1=t1.next;
  }
  if(t1.next.next!=null) {
   
    t1.next=t1.next.next;
   } else {
     t1.next=null;
   }
  }
}

public static void print(llQ3 list) {
  node temp=list.head;
  while(temp!=null) {
   System.out.print(temp.val+" ");
   temp=temp.next;
  }
}

public static void main(String[] a) {
  llQ3 l = new llQ3();
  l=insert(l,1);
  l=insert(l,2);
  l=insert(l,3);
  l=insert(l,4);
  l=insert(l,5);
  l=insert(l,2);
  System.out.println("The given linkedlist:");
  print(l);
  System.out.println();
  System.out.println("The updated linkedlist:");
  op(l,2);
  print(l);
 }
}