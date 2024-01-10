class diagonal{

    public static void sum(int num[][]){
    int sum=0,sum1=0;
       for(int i=0;i<num.length;i++){
          for(int j=0;j<num.length;j++){
             //pd
             if(i==j){
               sum=sum+num[i][j];
             }
             else if(i+j==3){
              sum1+=num[i][j];
             }
          }
       }
       System.out.println(sum);
       System.out.println(sum1);
    }
    public static void main(String ag[]){
     int num[][]={
     {1,2,3,4},
     {5,6,7,8},
     {9,10,11,12},
     {13,14,15,16}
     };
     sum(num);
    }
}