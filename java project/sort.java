public class sort {
    public static boolean check(int arr[],int i){
       if(i==arr.length){
        return true;
       }
       if(arr[i-1]>arr[i]){
          return false;
       }
      return check(arr,i+1);
    }

    public static int sum(int n){
        if(n==0){
         return n;
       }
       return n%10+sum(n/10);
    }
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        // System.out.println(check(arr,1));
        System.out.println(sum(123));
     }
}
