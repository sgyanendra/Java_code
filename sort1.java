class sort{

    public static void bubbol(int num[]){
       for(int i=0;i<num.length;i++){
             for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                  int t=num[i];
                  num[i]=num[j];
                  num[j]=t;
                }
             }
       }
    }

    public static void selection(int num[]){
      for(int i=0;i<num.length;i++){
           int minPos=i;
           for(int j=i+1;j<num.length;j++){
             if(num[minPos]>num[j]){
               minPos=j;
             }
           }
           int t=num[minPos];
           num[minPos]=num[i];
           num[i]=t;
      }
    }

    public static void printArr(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
    public static void main(String arg[]){
      int num[]={3,6,2,1,8,7,4,5,3,1};
      //bubbol(num);
      selection(num);
      printArr(num);
    }
}