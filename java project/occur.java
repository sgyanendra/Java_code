public class occur {
    public static int count(int arr[],int n,int i){
        int l=arr.length;
        int c=0;
        if(i==l){
           return c;
         }
         if(arr[i]==n){
            c++;
         }
         return c+count(arr,n,i+1);
    }

    public static int sum(int arr[],int i){
        int sum=1;
        int l=arr.length;
        if(i==l){
           return sum;
        }
        // if(arr[i]%2!=0){
        //   sum=sum+arr[i];
        // }
         return arr[i]*sum(arr,i+1);
    }
    public static void main(String arg[]){
        int[] arr=new int[]{1,2,3,4};
        //  System.out.println(count(arr,8,0));
        System.out.println(sum(arr,0));
    }
}
