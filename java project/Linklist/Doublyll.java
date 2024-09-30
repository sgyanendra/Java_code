public class Doublyll{
    public class Node{
       int data;
       Node next;
       Node prev;
       Node(int data){
         this.data=data;
         this.next=null;
         this.prev=null;
       }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
          head=tail=newNode;
          return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void  removeFirst(){
      if(head==null){
         System.out.println("dll is empty!!");
         return;
        }
      head=head.next;
      head.prev=null;
      size--;
    }
  
    public void addLast(int data){
       Node newNode=new Node(data);
       size++;
       if(head==null){
          head=tail=newNode;
          return;
       }
       tail.next=newNode;
       newNode.prev=tail;
       tail=newNode;
    }

    public void removeLast(){
       if(head==null){
         System.out.println("dll is empty!!");
         return;
       }
      tail=tail.prev;
      tail.next=null;
      size--;
    }

    public void reverse(){
      Node curr=head;
      Node prev=null;
      Node next;
      while(curr!=null){
          next=curr.next;
          curr.next=prev;
          curr.prev=next;
          prev=curr;
          curr=next;
      }
      head=prev;
    }
    public void print(){
      Node temp=head;
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
    }

    public static void main(String args[]) {
      Doublyll dll=new Doublyll();
      dll.addFirst(3);
      dll.addFirst(2);
      dll.addFirst(1);
      dll.addLast(4);
      dll.addLast(5);
      dll.print();
      System.out.println("Size: "+size);
      //dll.removeFirst();
      // dll.removeLast();
       dll.reverse();
      dll.print();
      System.out.println("Size: "+size);
    }
}