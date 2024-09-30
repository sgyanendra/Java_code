package Linklist;

public class Checkcycle{
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
        Node ndwNode=new Node(data);
        if(head==null){
          head=tail=null;
        }
        ndwNode.next=head;
        head=ndwNode;
    }
    public void print(){
    Node temp=head;
    while(temp!=null){
       System.out.print(temp.data+" ");
       temp=temp.next;
    }
    System.err.println();
   }   
   
    public Node getMid(Node head){
       Node slow=head;
       Node fast=head.next;
       while (fast!=null && fast.next!=null ) {
           slow=slow.next;
           fast=fast.next;
       }
       return slow;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
           return head;
        }

        Node mid=getMid(head);
        Node rightHead=mid.next;
        mid.next=null;

        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    public Node merge(Node head1,Node head2){
         Node mergeLL=new Node(-1);
         Node temp=mergeLL;

         while(head1!=null && head2!=null){
              if(head1.data<=head2.data){
                 temp.next=head1;
                 head1=head1.next;
                 temp=temp.next;
              }
              else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
              }
         }
         while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;   
         }
         while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
         }
         return mergeLL.next;
    }
    public static void main(String[] args) {
        Checkcycle ll=new Checkcycle();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.print();
        head=ll.mergeSort(head);
        ll.print();     
    }
}
