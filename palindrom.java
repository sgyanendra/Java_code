class palindrom{
    public static void main(String args[]){
        for(int i=1;i<=6;i++){
            for(int l=i-1;l>1;l--){
            System.out.print(l + " ");  
            }
         for(int k = 1; k <i; k++){
            System.out.print(k + " ");
         }
            System.out.println();
        }
    }
}