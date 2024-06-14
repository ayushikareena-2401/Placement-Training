// Stack implementation in java.

class StaticStack {
  
  int[] arr;
  int size=-1,def=10;
 
  StaticStack() {
     arr= new int[def];
  }

  StaticStack(int n) {
    arr= new int[n];
  }

  public boolean isEmpty() {
     return size==-1;
  }

  public boolean isFull() {
      return (size==arr.length-1);
  }

  public void push(int n) {
      if(!isFull()) {
        arr[++size]=n;
        System.out.println(n+" is pushed.");
 
      } else {
        System.out.println("Stack is Full!.");
     }
  }

  public void pop() {
     if(!isEmpty()) {
        System.out.println(arr[size--]+" is popped.");
     } else {
        System.out.println("Stack is Empty!.");
     }
  }
 
  public void peek() {
      if(!isEmpty()) {
        System.out.println(arr[size--]+" is the peek element.");
     } else {
        System.out.println("Stack is Empty!.");
     }
  }

  public static void main(String[] a){
     StaticStack s= new StaticStack(5);
     s.push(1);
     s.push(2);
     s.push(3);
     s.push(4);
     s.push(5);
     s.push(6);//This will not get accomodated in the stack as the size of the stack is full.
     s.pop();
     s.pop();
     s.pop();
     s.pop();
     s.pop();
     s.peek();
  }

}