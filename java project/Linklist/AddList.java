package Linklist;

class AddList {
    public class Node {
     int data;
     Node next;
     public Node(int data){
       this.data=data;
       this.next=null;
     }
    }
    public static Node head;
    public  static Node tail;
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

     public void add(int idx,int data){
        if(idx==0){
           addFirst(data);
           return;
        }
         Node newNode=new Node(data);
         size++;
         Node temp=head;
         int i=0;
         while(i<idx-1){
           temp=temp.next;
           i++;
         }
         newNode.next=temp.next;
         temp.next=newNode;
     }

     public int removeFirst(){
        if(size==0){
           System.out.println("ll is empty");
           return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            size--;
            head=tail=null;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
     }

     public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
        }else if(size==1){
           int val=head.data;
           head=tail=null;
           size--;
           return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
          prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
     }
     
     public int helper(Node head,int key){
         if(head==null){
            return -1;
         }
         if(head.data==key){
             return 0;
         }

         int idx=helper(head.next, key);
         if(idx==-1){
           return -1;
         }

         return idx+1;
      }
     public int recSearch(int key){
      return helper(head,key);
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

    public void deleteNode(int n){
       if(head==null){
         System.out.println("ll is empty");
         return;
       }else if(size==1 && n==1){
          head=tail=null;
          size--;
          return;
       }else if(n==size){
          head=head.next;
          return;
       }
       Node temp=head;
       int i=1;
       while(i<size-n){
          temp=temp.next;
          i++;
      }
      temp.next=temp.next.next;
      size--;
    }
     public void print(){
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
        }
        System.out.println();
     }
     public static void main(String arg[]){
      AddList ll=new AddList();
      ll.addFirst(2);
      ll.addFirst(1); 
      ll.addFirst(0);
      ll.addLast(3);
      ll.addLast(4);
    //   ll.add(0,20);
      ll.print();
      System.out.println("Size:"+size);
   //   ll.removeFirst();
   //   ll.print();
   //   System.out.println("Size:"+size);
   //   ll.removeLast();
   //   ll.print();
   //   System.out.println("Size:"+size);
   //   System.err.println(ll.recSearch(3));
   //   System.err.println(ll.recSearch(10));  
 
   //  ll.reverse();
   //  ll.print();
       ll.deleteNode(5);
       ll.print();
       System.out.println("Size:"+size);

      }    
}