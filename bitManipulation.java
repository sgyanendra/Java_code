import java.util.*;
class bitManipulation{
    
    public static void evenOdd(int n){
       if((n&1)==0){
          System.out.println("Even Number!!");
       } 
       else{
        System.out.println("Odd Number!!!");
       }
    }


    public static int getIthbit(int n,int i){
         int bit=(1<<i);
         if((n&bit)==0){
            return 0;
         }
         else{
            return 1;
         }
     }

     public static int setIthbit(int n,int i){
       int b=(1<<i);
       return n|b;
     }

     public static int clearIthBit(int n,int i){
        int b=(~(1<<i));
        return (n&b);
     }

     public static int updateIthBit(int n,int i,int bit){
        n=clearIthBit(n,i);
        int b=bit<<i;
        return n|b;
     }
    public static void main(String arg[]){
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number!!");
    int n=sc.nextInt();
    System.out.println("Enter the ith Position");
    int i=sc.nextInt();
    System.out.println("AND Operation: "+(n&i));
     System.out.println("OR Operation: "+(n|i));
      System.out.println("XOR Operation: "+(n^i));
       System.out.println("Left Shift: "+(n<<i));
        System.out.println("Right Shift: "+(n>>i));
        evenOdd(n);
        System.out.println("getIthBit: "+getIthbit(n,i));
         System.out.println("getIthBit: "+setIthbit(n,i));
         System.out.println("clearIthBit: "+clearIthBit(n,i));

         System.out.println("updateIthBit: "+updateIthBit(n,i,1));
    }
}