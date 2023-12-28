import java.util.*;
class subArray{
    public static void main(String arg[]){
     int arr[]=new int[6];
     Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("SubArray Element!!");
     for(int i=0;i<6;i++){
        for(int j=i;j<6;j++){
            for(int k=i;k<j;k++){
               System.out.print(arr[k]);
            }
            System.out.print("  ");
        }
        System.out.println();
     }
    }
}