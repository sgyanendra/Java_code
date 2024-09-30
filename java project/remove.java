public class remove {
    public static int removeEle(int arr[]){
        int l=arr.length;
        int temp[]=new int[l];
        int k=0;
        int ln=0;
         for(int i=0;i<arr.length;i++){
            int f=0;
            for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j]){
                 f++;
              }
            }
             
            if(f==0){
              temp[k++]=arr[i];
              ln++;
            }
            else if(f>=1){
                for(int t=0;t<2;t++){     
                 temp[k++]=arr[i];
                 ln++;  
                }
                i=i+f;
            }
        }
         for(int i=0;i<ln;i++){
          arr[i]=temp[i];
          //System.err.print(temp[i]+" ");
         }
         return ln;
    }
    public static void main(String arg[]){
        int arr[]={1,1,1,2,2,3,3,3,4}; 
        int n=removeEle(arr);
        for(int i=0;i<n;i++){
         System.err.println(arr[i]);
        }
    }
}
