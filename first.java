import java.util.*;
class first{
    public static void main(String arg[]){
       int n,c=1,sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("ENter the number:");
       n=sc.nextInt();
       while(c<=n){
         sum=sum+c;
         c++;
       }
       System.out.println("Sum:"+sum);
  }
}