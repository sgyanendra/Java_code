import java.util.*;
class decimal{
    public static double binaryN(int n){
        double sum=0,r;
        int i=0;
     while(n!=0){
       r=n%10;
       if(r!=0){
       sum=sum+Math.pow(2,i);
       }
       n=n/10;
       i++;
     } 
     return sum;
    }

  public static void main(String  arg[]){
   Scanner sc=new Scanner(System.in);
   int n,i=1;
   System.out.println("Enter the Binary Number:");
   n=sc.nextInt();
     double d=binaryN(n);
     System.out.println("Decimal Number:"+d);
  }
}