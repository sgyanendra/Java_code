import java.util.*;
class vowel{
   public static void main(String arg[]){
         Scanner sc=new Scanner(System.in);
         String st="";
         int c=0;
         System.out.println("Enter the String!!");
         st=sc.nextLine();

         for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='a' && st.charAt(i)<='z'){
              c++;
            }
         }
         System.out.println("Total lower case:"+c);
   }
}