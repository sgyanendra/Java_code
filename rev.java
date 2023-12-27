class rev{
    public static void reverse(int arr[]){
    int temp,first=0,last=arr.length-1;
         while(first<last){
           temp=arr[last];
           arr[last]=arr[first];
           arr[first]=temp;
           first++;
           last--;
         }
   }
    public static void main(String arg[]){
    int arr[]={1,2,3,4,5,6};
    reverse(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
    }
    }
}