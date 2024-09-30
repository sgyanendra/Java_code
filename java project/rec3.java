public class rec3 {
    public static String convert(int n){
        String num[]=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n<10){
         return num[n];
       }
       int r=n%10;
       return convert(n/10)+" "+num[r];
    }
    public static void main(String arg[]){
       System.out.println(convert(1978));
    }
}
