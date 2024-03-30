//CHECK IF THE ELEMENTS OF THE LINKEDLIST IS A PALINDROME OR NOT.

class llQ5 {
  static node head;

  static class node {
     int val;
     node next;
     node(int val) {
      this.val=val;
      this.next=null;
     }
  }
  
 public static llQ5 insert(llQ5 list,int val) {
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

public static boolean check(int[] arr) {
  int l=0,h=arr.length-1;
  while(l<=h) {
    if(arr[l]!=arr[h]) {
       return false;
    }
    l++;
    h--;
  }
   return true;
}

public static boolean op(llQ5 l) {
  int count=1;
  node temp=llQ5.head;
  while(temp.next!=null) {
     temp=temp.next;
     count++;
  }
  int i=0;
  int[] ans = new int[count];
  temp=llQ5.head;
  while(temp!=null) {
     ans[i++]=temp.val;
     temp=temp.next;
  }
  boolean a= check(ans);
  return a;
}

public static void print(llQ5 list) {
  node temp=list.head;
  while(temp!=null) {
   System.out.print(temp.val+" ");
   temp=temp.next;
  }
}

public static void main(String[] a) {
  llQ5 l = new llQ5();
  l=insert(l,1);
  l=insert(l,2);
  l=insert(l,3);
  l=insert(l,2);
  l=insert(l,1);
  System.out.println("The given linkedlist:");
  print(l);
  System.out.println();
  System.out.println(op(l));
 }
}