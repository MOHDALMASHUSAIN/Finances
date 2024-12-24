   package CH4StringsBasics;
class Queue{
   private static int maxSize;
   private static int front;
   private static int rear;
   private static int arr[];
   public Queue(int capacity){
    this.front = 0;
    this. rear =-1;
    this.maxSize = capacity;
    this.arr = new int[maxSize];
   }
   static void offer(int value){
    if (rear<maxSize) {
      System.out.println(arr[++rear] = value);
    }
    else{
      System.out.println("overflow");
    }

   }
   static int poll(){
    if (rear>front) {
      int element = arr[front++];
      System.out.println("deleted element is::");
      return element;
      
    }
    else{
      System.out.println("underflow condition");
     
    }
     return -1;
  }
    static int Peek(){

    }

     
}

public class Classpractice {

 
public static void main(String[] args){



  }    
  }