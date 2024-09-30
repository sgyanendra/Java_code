public class backArray {

  public static void changeArr(int arr[],int i,int n){
        if(i==arr.length){
          return;
        }
        arr[i]=n;
        changeArr(arr, i+1, n+1);
        arr[i]=arr[i]*2;
  }
  public static void printArr(int arr[]){
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
      }
  }
 public static void main(String[] args) {
  int arr[]=new int[5];
  changeArr(arr,0,1);
  printArr(arr); 
}
}