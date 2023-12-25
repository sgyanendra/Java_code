class pat1{
    public static void main(String arg[]){
    int i,j;
    for(i=0;i<5;i++){
         for(j=0;j<=i;j++){
           System.out.print(" * ");
         }
         System.out.println();
    } 

    for(i=1;i<=4;i++){
       for(j=1;j<=i;j++){
         System.out.print(j);
       }
       System.out.println();
    }
 
   char ch='A';
    for(i=1;i<=4;i++){
       for(j=1;j<=i;j++){
         System.out.print(ch);
        ch++;
       }
       System.out.println();
    }
    }
}