import java.util.*;
class fact{
    public static void main(String arg[]){
      int f=1,i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      n=sc.nextInt();
      for(i=1;i<=n;i++){
        f=f*i;
      }
      System.out.println("Fcatorial:"+f);
    }
}