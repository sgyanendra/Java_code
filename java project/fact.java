class fact{
    public static void fact1(int n){
       if(n==0){
         return;
       }
       fact1(n-1);
       System.out.println(n);
    }
    public static int fact2(int n){
       if(n==0){
         return 1;
       }
    return n*fact2(n-1);
    }
    public static int square(int n,int x){
       if(x==1){
        return n;
       }
       return n*square(n,x-1);
    }
    public static void fab(int a,int b,int n){
        if(n==0){
          return;
        }
        int t=a+b;
        a=b;
        b=t;
        System.out.print(" "+t+" ");
        fab(a,b,n-1);        
    }
    public static void main(String[] args) {
    //     fact1(4);
    //  System.out.println(fact2(4));
    //  System.out.println(square(4,3));
    int a=2,b=4,n=10;
    System.out.print(a+" "+b);
    fab(a,b,n-2);   
 }
}