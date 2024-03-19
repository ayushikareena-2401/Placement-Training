//Priority Queue Implementation.

import java.io.*;
import java.util.*;

class Queue {
   int value;
   int index;
}

class PriorityQueue1 {
  Queue[] arr = new Queue[10000];
  static int size=-1;
 
 public void enqueue(int v,int p) {
   size++;
   arr[size] = new Queue();
   arr[size].value=v;
   arr[size].index=p;
 }
 
public int peek(){
   int ind=-1,highestPriority=Integer.MIN_VALUE;
   for(int i=0;i<=size;i++){
      if(highestPriority==arr[i].index && ind>-1 && arr[i].value>arr[ind].value) {
        highestPriority=arr[i].index;
        ind=i;
      } else if(highestPriority<arr[i].index){
        highestPriority=arr[i].index;
        ind=i;
      }
   }
   return ind;
}

public void dequeue(){
  int k=peek();
  for(int i=k;i<size;i++) {
     arr[i]=arr[i+1];
  }
  size--;
}

public static void main(String[] a){
    PriorityQueue1 q = new PriorityQueue1();
    q.enqueue(10,1);
    q.enqueue(20,1);
    q.enqueue(30,1);
    int i1=q.peek();
    System.out.println("The highest priority element in the queue is:"+i1);
    q.dequeue();
    int i2=q.peek();
    System.out.println("The highest priority element in the queue is:"+i2);
    q.dequeue();
    int i3=q.peek();
    System.out.println("The highest priority element in the queue is:"+i3);
    q.dequeue();
 }
}

















