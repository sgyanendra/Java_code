import java.util.*;
public class ReverseString {
   public static String reverStr(String str){
     Stack<Character> s=new Stack<>();
     int i=0;
     while(i<str.length()){
       s.push(str.charAt(i));
       i++;
      }
     StringBuilder st=new StringBuilder();
     while(!s.isEmpty()){
        st.append(s.peek());
        s.pop();
     }

     return st.toString();
   }
   public static void main(String[] args) {
    String str="hello java";
     System.out.println(reverStr(str));
   }
}