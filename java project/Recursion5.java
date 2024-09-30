public class Recursion5 {
    public static int group(int n){
        if(n==1 || n==2){
          return n;
        }
        return group(n-1)+(n-1)*group(n-2);
    }

    public static void binary(int n,int lp,String str){
         if(n==0){
            System.out.println(str);
            return;
         }
        binary(n-1, 0, str+"0");
        if(lp==0){
          binary(n-1, 1, str+"1");
        }
    }
    
    public static void main(String arg[]){
     //System.out.println(group(3));
       binary(3, 1," ");
    }
}
