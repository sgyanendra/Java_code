import java.util.*;
class vowel{
   public static void main(String arg[]){
        /* Scanner sc=new Scanner(System.in);
         String st="";
         int c=0;
         System.out.println("Enter the String!!");
         st=sc.nextLine();

         for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='a' && st.charAt(i)<='z'){
              c++;
            }
         }
         System.out.println("Total lower case:"+c);*/

         String str="ShradhaDidi";
         String st2="ApnaCollege".replace("l","");
         String st3=new String("ShradhaDidi");
         System.out.println(st2);
         System.out.println(str.equals(st2)+" "+str.equals(st3));

   }
}