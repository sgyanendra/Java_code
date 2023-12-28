import java.util.*;
class subArraysum{
    
    /*public static void sum(int sum){
     for(int i=0;i<100;i++){
        arr1[i]=sum;
      }
    }*/
    public static void main(String arg[]){
     int arr[]=new int[6];
     int arr1[]=new int[100];
      int sum=0,t=0;
     Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("SubArray Element!!");
     for(int i=0;i<6;i++){
        for(int j=i;j<6;j++){
            for(int k=i;k<j;k++){
              sum=sum+arr[k];
            }
            arr1[t]=sum;
            t++;
        }
    }
     int max=arr1[0];
     for(int i=0;i<arr1.length;i++){
        if(max<arr1[i]){
         max=arr1[i];
        }
     }
     System.out.println("Max Element:"+max);
    }
}