import java.util.*;
class sort{
    
    public static void bubbol(int num[]){
        for(int i=0;i<num.length;i++){
           for(int j=0;j<num.length;j++){
             if(num[i]>num[j]){
               int temp=num[i];
               num[i]=num[j];
               num[j]=temp;
             }
           }
        }
    }

    public static void selection(int num[]){
      for(int i=0;i<num.length-1;i++){
         int minPos=i;
         for(int j=i+1;j<num.length;j++){
           if(num[minPos]>num[j]){
             minPos=j;
           }
         }
          int temp=num[minPos];
          num[minPos]=num[i];
          num[i]=temp;
      }
    }

    public static void insertion(int num[]){
     for(int i=1;i<num.length;i++){
        int cur=num[i];
        int prev=i-1;
        while(prev>=0 && num[prev]>cur){
           num[prev+1]=num[prev];
           prev--;
        }
        num[prev+1]=cur;
     }
    }

    public static void counting(int num[]){
       int largest=Integer.MIN_VALUE;
       for(int i=0;i<num.length;i++){
           largest=Math.max(largest,num[i]);
       }

       int count[]=new int[largest+1];
       for(int i=0;i<num.length;i++){
         count[num[i]]++;
       }

       int j=0;
       for(int i=0;i<count.length;i++){
          while(count[i]>0){
             num[j]=i;
             j++;
             count[i]--;
          }
       }
    }
    public static void printArr(int num[]){
        for(int i=0;i<num.length;i++){
           System.out.print(num[i]);
        }
    }
    public static void main(String arg[]){
     int num[]={2,7,5,9,1,3,1,2,5};
     //bubbol(num);
     //selection(num);
     //insertion(num);
     counting(num);
     printArr(num);
    }
}