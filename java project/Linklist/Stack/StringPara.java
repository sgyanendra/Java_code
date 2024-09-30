import java.util.*;
public class StringPara {
    public static boolean checkString(String srt){
      Stack<Character> s=new Stack<>();
      for(int i=0;i<srt.length();i++){
          char ch=srt.charAt(i);
          if(ch=='[' || ch=='{' || ch=='('){
             s.push(ch);
          }else{
             if(s.isEmpty()){
                 return false;
             }
             if((s.peek()=='(' && ch==')')||
             (s.peek()=='{' && ch=='}')||
             (s.peek()=='[' && ch==']')
             ){
               s.pop();
             }else{
                return false;
             }
          }
        }
        if(s.isEmpty()){
           return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String srt="(";
        System.out.println(checkString(srt));
    }
}
