//Queue Implementation in JAVA.

class DynamicQueue {

   int[] arr;
   int size=-1;
   int def=10;

   DynamicQueue() {
     arr= new int[def];
  }

  DynamicQueue(int n) {
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
      if(isEmpty()) {
          System.out.println("Queue is Empty");
      } else {
           System.out.println(arr[size]+" is the end of the queue.");
      }
   }

  public void add(int n) {
    if(isFull()) {
        int[] temp = new int[2*arr.length];
        for(int i=0;i<arr.length;i++) {
          temp[i]=arr[i];
        }
        arr=temp;
        arr[++size]=n;
        System.out.println(arr[size]+" is added to the queue.");
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
     DynamicQueue q = new DynamicQueue(5);
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