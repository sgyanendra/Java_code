public class max {
    public static int find(int arr[],int f,int i){
     //int f=0;  
     if(i==arr.length){
        return f;
      }
      if(f<arr[i]){
         f=arr[i];
      }
      return find(arr,f,i+1);
    }
    public static void main(String arg[]){
        int arr[]={1,2,3,4,17,6};
        System.out.println(find(arr,0,0));
    }
}
