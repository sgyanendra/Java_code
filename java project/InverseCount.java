public class InverseCount {
     public static int found(int arr[]){
        int c=0;
         for(int i=0;i<arr.length;i++){
              for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){  
                  return 1;
                }
                else if(arr[i]==arr[j]){
                     c++;
                }
              }
         }
         if(c==arr.length){
            return -1;
         }
         return 0;
     }
     
    public static void pair(int arr[]){
       for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
             if(arr[i]>arr[j] && i<j){
                System.out.print("("+arr[i]);
                System.out.print(","+arr[j]+"),");
             }
          }
       }
    }
     public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        int f=found(arr);
        //System.out.println(f);
        if(f==0)
          System.out.println(f+" Because array is all ready sorted!!");
        else if(f==-1)
        System.out.println(0+" Because array is all element is same and all ready sorted!!");
        else
         pair(arr);
     }
}
