public class second {
    public static void even(int n){
        if(n==0){
          return;
        }
        even(n-1);
        if(n%2==0){
          System.out.println(n);
        }      
    } 
    public static int sum(int n){
       if(n==0){
         return n;
       }
       return n+sum(n-1);
    }
    public static boolean palindrom(String str,int i){
         String st=" "; 
         int l=str.length()-1;
         if(i==l+1){
          return true;
         }
        if((str.charAt(i)!=str.charAt(l-i))&& i<l){
           return false;
        }
        else{
          palindrom(str, i+1);
        }
        return true;
    }
     public static void main(String ar[]){
       //even(10);
       //System.out.println("sum:"+sum(5));
      String str="name";
      //String s=
      System.out.println(palindrom(str,0));
     
     }    
}
