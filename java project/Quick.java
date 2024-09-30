public class Quick {
     public static void quickSort(int arr[],int si,int ei){
      if(si>=ei){
        return;
      }  
      int pInx=partition(arr,si,ei);
      quickSort(arr, si, pInx-1);
      quickSort(arr, pInx, ei);
     }
     public static int partition(int arr[],int si,int ei){
          int pivot=arr[ei];
          int i=si-1;
          for(int j=si;j<ei;j++){
             if(arr[j]<=pivot){
                 i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
             }
          }
          i++;
          int temp=pivot;
          arr[ei]=arr[i];
          arr[i]=temp;
          return i;
     }
     public static void main(String[] args) {
      int arr[]={2,3,1,6,5,7,3};
      quickSort(arr,0,arr.length-1);
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
      }
     }
}