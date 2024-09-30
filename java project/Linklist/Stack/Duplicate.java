import java.util.*;
public class Duplicate {
   public static boolean checkDuplicate(String srt){
      Stack<Character> s=new Stack<>();
      for(int i=0;i<srt.length();i++){
         char ch=srt.charAt(i);
         if(ch==')'){
            int count=0;
            while(s.pop()!='('){
             count++;
            }
            if(count<1){
               return true;
            }
         }else{
            s.push(ch);
         }
      }
     return false;
   }
   public static void main(String[] args) {
      String srt="((a+b))";
      System.out.println(checkDuplicate(srt));
   }
}