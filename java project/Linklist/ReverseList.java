package Linklist;

public class ReverseList{
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
    public void addFirst(int data){
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

    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
        }
        head=prev;
    }

    public void deleted(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
          temp=temp.next;
          sz++;
        }
        if(n==sz){
           head=head.next;
        }
        int i=1;
        Node prev=head;
        while(i<sz-n){
           prev=prev.next;
           i++;
        }
        prev.next=prev.next.next;
        return;   
    }
    public static void main(String[] args) {
        ReverseList ll=new ReverseList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        // ll.reverse();
        ll.deleted(4);
        ll.print();
    }
}
