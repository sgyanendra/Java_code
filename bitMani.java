class bitMani{

    public static int clearLast(int n,int i){
       int bit=(-1)<<i;
       return n&bit;
    }
    public static int clearRange(int n,int i,int j){
       int a=(-1)<<j+1;
       int b=(1<<i)-1;
       int bit=(a|b);
       return n&bit; 
    }

    public static void evenOdd(int n){
      if((n&1)!=0){
        System.out.println("Odd Number");
      }
      else{
        System.out.println("Even Number");
      }
    }

    public static boolean powertwo(int n){
         return (n&(n-1))==0;
    }

    public static int countBit(int n){
          int c=0;
          while(n!=0){
            if((n&1)!=0){
              c++;
            }
            n=n>>1;
          }
          return c;
    }

    public static int power(int n,int i){
         int ans=1;
         while(i>0){
            if((n&1)!=0){
               ans=n*ans;
            }
            i=i>>1;
            n=n*n;
         }
         return ans;
    }
    public static void main(String arg[]){
      System.out.println(clearLast(5,2));
       System.out.println(clearRange(20,1,3));
       evenOdd(16);
      System.out.println(powertwo(16));
      System.out.println(countBit(10));
      System.out.println(power(5,3));




    }
}