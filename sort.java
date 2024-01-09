class sort{
    
    public static void bubbol(int num[]){
        for(int i=0;i<num.length;i++){
           for(int j=0;j<num.length;j++){
             if(num[i]>num[j]){
               int temp=num[i];
               num[i]=num[j];
               num[j]=temp;
             }
           }
        }
    }

    public static void selection(int num[]){
      for(int i=0;i<num.length-1;i++){
         int minPos=i;
         for(int j=i+1;j<num.length;j++){
           if(num[minPos]>num[j]){
             minPos=j;
           }
         }
          int temp=num[minPos];
          num[minPos]=num[i];
          num[i]=temp;
      }
    }
    public static void printArr(int num[]){
        for(int i=0;i<num.length;i++){
           System.out.print(num[i]);
        }
    }
    public static void main(String arg[]){
     int num[]={2,7,5,9,1,3};
     //bubbol(num);
     selection(num);
     printArr(num);
    }
}