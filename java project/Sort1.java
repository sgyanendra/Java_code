class Sort1{
  public static void mergeSort(int arr[],int si,int ei){
       int mid=si+(ei-si)/2;
       if(si>=ei){
         return;
       }
       mergeSort(arr, si, mid);
       mergeSort(arr, mid+1, ei);
       merge(arr,si,mid,ei);
  }
  public static void merge(int arr[],int si,int mid,int ei){
       int temp[]=new int[ei-si+1];
       int i=si;
       int j=mid+1;
       int k=0;
       while(i<=mid && j<=ei){
           if(arr[i]<arr[j]){
             temp[k]=arr[i];
             i++;
           }else{
            temp[k]=arr[j];
            j++;
           }
           k++;
       }
       while(i<=mid){
         temp[k++]=arr[i++];
       }
       while(j<=ei){
         temp[k++]=arr[j++];
       }

       for(i=0,k=si;i<temp.length;i++,k++){
           arr[k]=temp[i];
       }
      }
  public static void main(String arg[]){
    int arr[]={2,4,1,7,6,4,0};
    mergeSort(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
        System.out.printf(" "+arr[i]);
    }
  }
}