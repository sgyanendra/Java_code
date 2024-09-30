import Linklist.Checkcycle;

public class AddFirst {
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
    public static int size;
   
    public void addFirst(int data){
     Node newNode=new Node(data);
     size++;
     if(head==null){
       head=tail=newNode;
       return;
     }
     newNode.next=head;
     head=newNode;
    }

    public void addLast(int data){
     Node newNode=new Node(data);
     size++;
      if(head==null){
         head=tail=newNode;
         return;
      }
      tail.next=newNode;
      tail=newNode;
    }

    public void addPos(int idx,int data){
       if(idx==0){
        addFirst(data);
        return;
       }
       Node newNode=new Node(data);
       size++;
       int i=0;
       Node temp=head;
       while(i<idx-1){
          temp=temp.next;
          i++;
       } 
       newNode.next=temp.next;
       temp.next=newNode;
    }

    public int removeFisrt(){
        if(size==0){
          System.out.println("LL is empty!!");
          return Integer.MIN_VALUE;
        }
        else if(size==1){
          int val=head.data;
          head=tail=null;
          size=0;
          return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
          System.out.println("LL is empty!!");
          return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
           prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
             if(temp.data==key){
              return i;
             }
             temp=temp.next;
             i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
         if(head==null){
           return -1;
         }
         if(head.data==key){
           return 0;
         }
        int idx=helper(head.next,key);
        if(idx==-1){
          return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
          System.out.print(temp.data+" ");
          temp=temp.next;
        }
        System.out.println();
    }

     public static boolean Checkcycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
             slow=slow.next;
             fast=fast.next.next;
             if(slow==fast){
                return true;
             }
        }
        return false;
    }
    public static void main(String[] args) {
        // AddFirst ll=new AddFirst();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addPos(3, 9);
        // ll.print();
        // ll.removeFisrt();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.recSearch(10));
        // System.out.println(ll.itrSearch(10));
        // System.out.println(size);

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        System.out.println(Checkcycle());

    }
}
