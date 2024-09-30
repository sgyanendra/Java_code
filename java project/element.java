public class element {
    public static int search(int arr[],int tar,int si,int ei){
        int mid=si+(ei-si)/2;
        if(si>ei){
            return -1;
        }

        if(arr[mid]==tar){
           return mid;
        }

        if(arr[si]<=arr[mid]){
             if(arr[si]<=tar && tar<=arr[mid]){
                 return search(arr, tar, si, mid);
             }
             else{
                return search(arr, tar, mid+1, ei);
             }
        }
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
               return search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static int binary(int arr[],int tar,int si,int ei){
        while(si<=ei){ 
            int mid=si+(ei-si)/2;
            if(arr[mid]==tar){
               return mid;
            }

            if(arr[mid]<tar){
              si=mid+1;
            }
            else{
                ei=mid-1;
            }
         }
         return -1;
        } 
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int t=4;
        int idx=search(arr,t,0,arr.length-1);
        //System.out.println(idx+" ");
        System.out.println(binary(arr, t, 0, arr.length-1)+" ");
      }    
}
