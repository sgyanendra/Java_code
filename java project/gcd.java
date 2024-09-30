public class gcd {
    public static int findGcd(int a,int b,int i){
        int g=1;
        if(i==1){
          return g;
        }
        if(a%i==0 && b%i==0){
           //g=i;
           return i;
        }
        return findGcd(a, b, i-1);
    }
    public static void main(String[] args) {
        int a=10,b=6,i;
        if(a<b){
         i=a;
        }
        else{
            i=b;
        }
        System.out.println(findGcd(a,b,i));
    }
}
