public class MajorElement {
    public static int searchEle(int arr[]){
         int l=arr.length/2;
         int n=0,k=0;
         for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(n<count){
               n=count;
               k=arr[i];
            }
         }
         return k;
    }
     public static void main(String[] args) {
        int arr[]={2,4,2,2,9,8,7,6};
        System.out.println(searchEle(arr));
     }
}
