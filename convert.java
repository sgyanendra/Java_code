import java.util.*;
class convert{
    public static void uppercase(String st){
    //String st1="";
    StringBuilder st1=new StringBuilder(" ");
        st1.append(Character.toUpperCase(st.charAt(0)));
      /* for(int i=1;i<st.length();i++){
          if(st.charAt(i)==' ' && i<st.length()-1){
            st1+=' ';
            i++;
            st1+=Character.toUpperCase(st.charAt(i));
          }
          else{
            st1+=st.charAt(i);
          }
       }
       System.out.println(st1);*/

        for(int i=1;i<st.length();i++){
          if(st.charAt(i)==' ' && i<st.length()-1){
            st1.append(" ");
            i++;
            st1.append(Character.toUpperCase(st.charAt(i)));
          }
          else{
            st1.append(st.charAt(i));
          }
       }
       System.out.println(st1);
       
    }
    public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       String st="";
       st=sc.nextLine();
       uppercase(st);
    }
}