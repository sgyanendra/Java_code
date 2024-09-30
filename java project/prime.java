public  class prime {
     public static void main(String[] args) {
        int n=20;
        int i,j;
        for(i=1;i<=n;i++){
           for(j=2;j<=i;j++){
               if(i%j==0){
                //System.out.print(j+" ");
                 //System.out.print("Hello");
                break;
                }
           }
           if(i==j){
            System.out.print(j+" ");
           }
        }
     }
}
