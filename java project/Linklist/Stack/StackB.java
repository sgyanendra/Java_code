// public package Stack;

import java.util.ArrayList;

public class StackB {
     static class Stack{
       static ArrayList<Integer> list=new ArrayList<>();
       public static boolean isEmpty(){
        return list.size()==0;
       }
       public static void push(int data){
         list.add(data);
       }
       public static int pop(){
         int top=list.get(list.size()-1);
         list.remove(list.size()-1);
         return top;
       }
       public static int peek(){
        return list.get(list.size()-1);
       }
     }

     public static void main(String[] args) {
       Stack s=new Stack();
       s.push(10);
       s.push(20);
       s.push(30);
       s.push(40);

       while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
       }
     }
}