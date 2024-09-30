public class SortString {
    public static void sort(String arr[],int si,int ei){
        if(si>=ei){
           return;
        }
        int mid=si+(ei-si)/2;
        sort(arr,si,mid);
        sort(arr,mid+1,ei);
        merge(arr,si,ei,mid);
    }
    public static String[] merge(String arr[],int si,int ei,int mid){
        String temp[]=new String[ei-si+1]; 
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
             if(arr[i].compareTo(arr[j])<0){
               temp[k]=arr[i];
               i++;
             }
             else{
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
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
       return arr;
    }
    public static void main(String[] args) {
        String arr[]={"sun","earth","mars","mercury"};
        sort(arr,0,arr.length-1);
      for(int i=0;i<arr.length;i++){
        System.err.print(arr[i]+" ");
      }
    } 
}
