package Linklist;

public class checkPalindrom {
    

    class Node{
        int data;
        Node next;
        public Node(int data){
          this.data=data;
          this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;    
    public void add(int data){
    Node newNode=new Node(data);
    size++;
        if(head==null){
          head=tail=newNode;
          return;
       }
       tail.next=newNode;
       tail=newNode;
    }
    

    int arr[]=new int[10];
    public boolean check(){
        if(head==null || head.next==null){
          return true;
        }
        Node temp=head;
        int i=0;
        while(temp!=null){
          arr[i++]=temp.data;
          temp=temp.next;
        }
        for(int j=0;j<i;j++){
            if(arr[j]!=arr[i-1-j]){
               return false;
            }
        }
        return true;
    }
   
    /* 
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
        if(head==null || head.next==null){
          return true;
        }
        Node mideNode=findMid(head);
        Node prev=null;
        Node curr=mideNode;
        Node next;
        while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
        }

        while(prev!=null){
            if(head.data!=prev.data){
              return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
    */
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.err.println();
    }
    public static void main(String[] args) {
        checkPalindrom ll=new checkPalindrom();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(1);
        ll.print();
        System.out.println("Size: "+size);
        System.out.println(ll.check());
        //ll.print();
    }
}
