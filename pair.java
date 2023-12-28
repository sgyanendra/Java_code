import java.util.*;
class pair{
    public static void main(String arg[]){
        int a[]=new int[5];
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Number::");
        for(int i=0;i<5;i++){
           a[i]=sc.nextInt();
        }
        System.out.println("Array Pair!!!!");
        for(int i=0;i<5;i++){
          for(int j=i+1;j<5;j++){
            System.out.print("("+a[i]+","+a[j]+")");
            c++;
          }
          System.out.println();
        }
        System.out.println("Total Pair::"+c);
    }
}