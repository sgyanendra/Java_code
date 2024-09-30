import java.util.*;
public class prime_series{
   public static void seriesprime(int n){
       int i,j;
        for(i=1;i<=n;i++){
           for(j=2;j<=i;j++){
             if(i%j==0){
               //System.out.println("Num. is not prime.");
               break;
             }
           }
           if(i==j)
           System.out.print(j+" ");
           
       }
   }
       
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n:");
      int n = sc.nextInt();
      seriesprime(n);
   }
}
