import java.util.*;
class binary{
    public static double decimalN(int n){
        double sum=0,r;
     while(n!=1){
       r=n%2;
       if(r==0 || r==1){
       sum=sum*10+r;
       }
       n=n/2;
     } 
     return sum*10+n;
    }

  public static void main(String  arg[]){
   Scanner sc=new Scanner(System.in);
   int n,i=1;
   System.out.println("Enter the Decimal Number:");
   n=sc.nextInt();
     double d=decimalN(n);
     System.out.println("Decimal Number:"+d);
  }
}