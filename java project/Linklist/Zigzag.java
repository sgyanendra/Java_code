package Linklist;
import java.util.*;
public class Zigzag {
    public class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
   }
   public static Node head;
   public static Node tail;
   public void add(int data){
     Node newNode=new Node(data);
     if(head==null){
       head=tail=newNode;
       return;
     }
     tail.next=newNode;
     tail=newNode;
   }
   public void print(){
     Node temp=head;
     while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
     }
     System.err.println();
   }
   public Node find(Node head){
      Node slow=head;
      Node fast=head;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;
   }
   public void zigzag(){
     Node mid=find(head);
     Node next;
     Node prev=null;
     Node curr=mid.next;
     mid.next=null;
     while(curr!=null){
         next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;
     }
      Node left=head;
      Node right=prev;
      Node nextL,nextR;
      while(left!=null && right!=null){
         nextL=left.next;
         left.next=right;
         nextR=right.next;
         right.next=nextL;

         left=nextL;
         right=nextR;
      }
    }
  public static void main(String[] args) {
    Zigzag ll=new Zigzag();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    ll.add(6);
    ll.print(); 
    ll.zigzag();
    ll.print();
}    
}