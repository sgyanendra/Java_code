class str2{
    public static boolean pali(String st){
       int n=st.length();
       for(int i=0;i<n;i++){
          if(st.charAt(i)!=st.charAt(n-1-i)){
             return false;
          }
       }
       return true;
    }
    public static void main(String arg[]){
       String st="monu";
       System.out.println(pali(st));
    }
}