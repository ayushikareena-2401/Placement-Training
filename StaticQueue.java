//Queue Implementation in JAVA.

class StaticQueue {

   int[] arr;
   int size=-1;
   int def=10;

   StaticQueue() {
     arr= new int[def];
  }

  StaticQueue(int n) {
    arr= new int[n];
  }

   public boolean isFull() {
      return (size==arr.length-1);
   }
    
   public boolean isEmpty() {
       return size==-1;
   }

   public void front() {
      if(isEmpty()) {
          System.out.println("Queue is empty");
      } else {
           System.out.println(arr[0]+" is the front of the queue");
      }
   }

   public void end() {
      if(isFull()) {
          System.out.println("Queue is full");
      } else {
           System.out.println(arr[size]+" is the end of the queue.");
      }
   }

  public void add(int n) {
    if(isFull()) {
          System.out.println("Queue is full");
      } else {
           arr[++size]=n;
           System.out.println(arr[size]+" is added to the queue.");
      }
  }
 
   public void remove() {
      if(isEmpty()) {
          System.out.println("Queue is empty");
      } else {
           for(int i=1;i<=size;i++) {
              arr[i-1]=arr[i];
           }
           System.out.println(arr[size]+" is removed from the queue.");
      }
   }

   public static void main(String[] a) {
     StaticQueue q = new StaticQueue();
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);
     q.add(5);
     q.add(6);
     q.front();
     q.end();
     q.remove();
     q.front();
   }
}