public class Rec1 {
/*     public static int find(int arr[],int i,int key){
     if(i<0){
      return -1;
     }

     int isFound=find(arr,i-1,key);
     if(arr[i]==key || isFound==-1){
      System.out.print(i);
      return i;
     }
     return isFound;
    }*/
    public static int find(int arr[],int i,int key){
        if(i==arr.length){
         return -1;
        }
   
        int isFound=find(arr,i+1,key);
        if(arr[i]==key || isFound==-1){
         System.out.print(i);
         return i;
        }
        return isFound;
       }
    public static void main(String arg[]){
       int arr[]=new int[]{2,3,4,5,6,2,3,2};
        find(arr,0,2);
    }
}
