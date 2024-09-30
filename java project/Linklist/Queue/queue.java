package Linklist.Queue;

public class queue {
   static class  queueB {
     static int arr[];
     static int rear;
     static int size;

     queueB(int n){
       arr=new int[n];
       rear=-1;
       size=n;
     }
     public static boolean isEmpty(){
         return rear==-1;
     }
     public static void add(int data){
       if(rear==size-1){
          System.out.println("queue is full!!");
          return;
       }
       rear++;
       arr[rear]=data;
     }
     public static int remove(){
        if(isEmpty()){
           return -1;
        }
        int val=arr[0];
        for(int i=0;i<rear;i++){
           arr[i]=arr[i+1];
        }
        rear--;
        return val;
     }
     public static int peek(){
        if(rear==-1){
          System.out.println("queue is empty !!");
          return -1;
        }
        return arr[0];
     }
   }
   public static void main(String[] args) {
     queueB q=new queueB(5);
     q.add(5);
     q.add(1);
     q.add(2);
     q.add(3);
     while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
     }
   }    
}
