class pat2{
    public static void main(String args[]){
       int t=1,i,j;
       for(i=1;i<=5;i++){
         for(j=1;j<=i;j++){
          System.out.print((t++)+" ");
         }
         System.out.println();
       }  

       int x=1,y=0;
       for(i=1;i<=5;i++){
         for(j=i;j>=1;j--){
            System.out.print(j%2);
         }
         System.out.println();
       }
    }
}