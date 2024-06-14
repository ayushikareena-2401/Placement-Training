// Stack implementation in java.

class DynamicStack {
  
  int[] arr;
  int size=-1,def=10;
 
  DynamicStack() {
     arr= new int[def];
  }

  DynamicStack(int n) {
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
        int[] temp = new int[2*arr.length];
        for(int i=0;i<arr.length;i++) {
          temp[i]=arr[i];
        }
        arr=temp;
        arr[++size]=n;
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
     DynamicStack s= new DynamicStack(5);
     s.push(1);
     s.push(2);
     s.push(3);
     s.push(4);
     s.push(5);
     s.push(6);//This will get accomodated in the stack as the size of the stack is not full. Since this is a dynamic stack.
     s.pop();
     s.pop();
     s.pop();
     s.pop();
     s.pop();
     s.peek();
  }

}