package Linklist;

public class Palindrom {

    public class Node {
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
        newNode.next=head;
        head=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
        }
        System.err.println();
    }

    public Node findMid(Node head){
       Node slow=head;
       Node fast=head;
       while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
       }
     return slow;
    }
   public boolean check(){
      if(head==null && head.next==null){
           return true;
      }
      Node midNode=findMid(head);
      Node next;
      Node curr=midNode;
      Node prev=null;
      while(curr!=null){
         next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;
      }
      
      Node right=prev;
      Node left=head;
      while (right!=null) {
         if(right.data!=left.data){
           return false;
         }
         left=left.next;
         right=right.next;
      }
      return true;
    }
    public static void main(String arg[]){
       Palindrom ll=new Palindrom();
       ll.add(1);
       ll.add(2);
       ll.add(2);
       ll.add(1);
       ll.print();
      System.out.println(ll.check());
    }    
}
