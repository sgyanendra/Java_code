public class third {
    public static String revers(String str,int i){
          String st="";
          if(i<0){
            return st;
          }      
         return st+=str.charAt(i)+revers(str, i-1);
        }
    public static int len(String str){
        if(str.isEmpty()){
          return 0;
        }
        return 1+len(str.substring(1));
    }
    public static void main(String arg[]){
        String str="Hello janu";
        //System.out.println(revers(str,str.length()-1));
        System.out.println(len(str));
    }
}
