import java.util.*;
class bio_fact{
    public static int factorial(int n){
         int f=1;
         for(int i=1;i<=n;i++){
           f=f*i;
         }
         return f;
    }
    public static int biofact(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nr_fact=factorial(n-r);
        int biomt=n_fact/(r_fact*nr_fact);
        return biomt;
    }
    public static void main(String arg[]){
        int n,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        n=sc.nextInt();
        System.out.println("Enter the R:");
        r=sc.nextInt();
        int bt=biofact(n,r);
        System.out.println("Binomial Factoriar:"+bt);
    }
}