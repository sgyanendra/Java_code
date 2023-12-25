class rev{
    public static void main(String agrg[]){
        int rev=0,r,n=10899,i;

        while(n!=0){
         r=n%10;
         n=n/10;
         rev=rev*10+r;
        }
        System.out.println("reverse:"+rev);
    }
}