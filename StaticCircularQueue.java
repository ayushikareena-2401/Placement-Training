//Circular Queue Implementation in JAVA.

class StaticCircularQueue {
  int def=10; 
  int front;
  int rear;
  int[] arr;
  int size;
  
  StaticCircularQueue() {
    arr = new int[def]; 
    front=-1;
    rear=-1;
    size=def;
  } 

  StaticCircularQueue(int n) {
    size=n;
    front=-1;
    rear=-1;
    arr = new int[n]; 
  }
 
  public boolean isFull() {
    return (!isEmpty()) && rear==front;
  }

  public boolean isEmpty() {
    return front == -1 && rear == -1;
  }

  public void enqueue(int n) {
    if(isEmpty()) {
       rear=0;
       front=0;
       arr[rear]=n;
    } else {
      rear=(rear+1)%size;
      if(front == rear) {
        System.out.println("Queue is full, element can not be inserted.");
        rear=(rear-1+size)%size;
        return;
      } else {
         arr[rear]=n;
      }
    }
    System.out.println(n+" is added to queue.");
  }
   
  public void dequeue() {
     int item=-1;
    if(!isEmpty()) {
      item=arr[front];
       if(front==rear) {
         front=-1;
         rear=-1;
       } else {
         front=(front+1)%size;
       }
    } else {
      System.out.println("Queue is Empty!");
      return;
    }
     System.out.println(item+" is removed from queue.");
  }

  public void peek() {
    if(!isEmpty()) {
      System.out.println(arr[front]+" is the peek element."); 
    } else {
      System.out.println("Queue is Empty!");
    }
  }

  public static void main(String [] a) {
     StaticCircularQueue q = new StaticCircularQueue(4);
     q.enqueue(1);
     q.enqueue(2);
     q.enqueue(3);
     q.enqueue(4);
     q.enqueue(5);
     q.peek();
     q.dequeue();
     q.peek();
  }
}