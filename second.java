import java.util.*;
class second{
    public static void main(String argg[]){
     Scanner sc=new Scanner(System.in);
    int i,sum1=0,n,sum2=0;
     System.out.println("Enter the Number");
     n=sc.nextInt();
     for(i=1;i<=n;i++){
          if(i%2==0){
           sum1=sum1+i;
          }
          else{
            sum2=sum2+i;
          }
     }
     System.out.println("Even Sum:"+sum1);
     System.out.println("Odd Sum:"+sum2);
    }
}