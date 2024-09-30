package Linklist;
import java.util.Scanner;

public class LinkedList {
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
 
    public void add(int idx,int data){
       if(idx==0){
           addFirst(data);
           return;
       }
       Node newNode=new Node(data);
       size++;
       Node temp=head;
       int i=0;
       while (i<idx-1) {
         temp=temp.next;
         i++;
       }
       newNode.next=temp.next;
       temp.next=newNode;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
        }
        System.out.println();
    }
     public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int n,ch,i;
        while(true){
            System.out.println("1: Add the number is first postion");
            System.out.println("2: Add the number is Last postion");
            System.out.println("3: Add the number is Add the Position");
            System.out.println("4: Add the number is Print");
            System.out.println("5: Exit");
            ch=sc.nextInt();

            switch(ch){
                  case 1:
                    System.out.println("Enter the number");
                    n=sc.nextInt();
                    ll.addFirst(n);
                    break;
                  case 2:
                    System.out.println("Enter the number");
                    n=sc.nextInt();
                    ll.addLast(n);
                    break;
                  case 3:
                    System.out.println("Enter the number");
                    n=sc.nextInt();
                    System.out.print("Enter the Index Value:");
                    i=sc.nextInt();
                    ll.add(i,n);
                    break;
                  case 4:
                     ll.print();
                     System.out.println(size );
                     break;
                  case 5:
                     System.exit(0); 
                     break;   
                }
        }
        // ll.print();
        // ll.addFirst(1); 
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
    }
}
