public class palindrom {
        public boolean palin(String s) {
            if(s.isEmpty()){
              return true;
            }
         String st=new String();
          for(int i=0;i<s.length();i++)
          {
             if(s.charAt(i)>='a' || s.charAt(i)<='z' || s.charAt(i)>='A' || s.charAt(i)<='Z'){
              st+=s.charAt(i);
             }
          }
    
          if((st.reverse()).equalsIgnoreCase(st)){
             return true;
          }
          else{
              return false;
          }
        }
      public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        Boolean b=palin(s);
        System.out.println(b);
      }    
}
